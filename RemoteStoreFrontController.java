import java.rmi.*;
import java.rmi.registry.*;
import java.util.Vector;

public class RemoteStoreFrontController {
    public static void main(String args[]) {
        try {
            // For testing purpose:
            Item item1 = new Item("name1", "type1", "desc1", 45, 6);
            Item item2 = new Item("name2", "type2", "desc2", 405, 26);
            Item item4 = new Item("name4", "type1", "desc5", 745, 60);

            Vector<Item> items = new Vector<Item>();
            items.add(item1);
            items.add(item2);
            items.add(item4);

            Customer customer1 = new Customer("username1", "password1", "John");
            Admin admin1 = new Admin("admin1", "pass1", "admin");

            Vector<User> users = new Vector<User>();
            users.add(customer1);
            users.add(admin1);

            UtilFunctions.writeFile(items, "items");
            UtilFunctions.writeFile(users, "users");

            Store frontController = new StoreFrontController();

            Naming.rebind("rmi://localhost:5000/RemoteStoreFrontController", frontController);
            System.out.println("Server is ready");
            System.out.println("--------------------------------------------------------------------------------");
        } catch (Exception e) {
            System.out.println("Server err: " + e.getMessage());
            e.printStackTrace();
        }
    }
}