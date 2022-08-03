import java.rmi.*;
import java.util.*;

public class ClientStoreFrontController {
    static int count = 0;

    // function to login again
    static void loginAgain() {
        count++;

        // prevent login more than thrice to avoid stack overflow
        if (count < 3) {
            ClientStoreFrontController.main(null);
        } else {
            System.out.println("Login failed 3 times, exiting");
        }
    }

    public static void main(String args[]) {
        try {

            Store frontController = (Store) Naming.lookup("rmi://localhost:5000/RemoteStoreFrontController");
            System.out.println("Client calling server");

            Scanner input = new Scanner(System.in);
            System.out.println("Admin or Customer: ");
            String type = input.nextLine();

            System.out.println("Enter Username: ");
            String username = input.nextLine();

            System.out.println("Enter Password: ");
            String password = input.nextLine();

            ArrayList<String> request = new ArrayList<String>();

            request.add(0, type);
            request.add(1, username);
            request.add(2, password);
            System.out.println("-------------------");

            UserView view = frontController.dispatchRequest(request);

            if (view != null) {
                view.mainMenu(0);
                int choice = input.nextInt();
                boolean keepGoing;
                keepGoing = view.mainMenu(choice);
                while (keepGoing) {
                    view.mainMenu(0);
                    choice = input.nextInt();
                    keepGoing = view.mainMenu(choice);
                }
                System.out.println("Thanks for using our store");
                input.close();
            } else {
                System.out.println("Username or password incorrect, try again.");
                loginAgain();
            }

        } catch (Exception e) {
            System.out.println("Client err : " + e.getMessage());
            e.printStackTrace();
        }
    }

}