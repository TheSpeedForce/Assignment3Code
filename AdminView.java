import java.util.Vector;

public class AdminView implements UserView {
    private Admin admin;
    private AdminCommandFactory adminCF;
    private Vector<Item> items;
    private Vector<User> users;

    public AdminView() {
    }

    public AdminView(String username, String password) {
        User user = UtilFunctions.getUser(username, password);
        this.admin = new Admin(user);
        this.items = UtilFunctions.readFile("items");
        this.users = UtilFunctions.readFile("users");

        this.admin.setItems(this.items);
        this.admin.setUsers(this.users);
        this.adminCF = new AdminCommandFactory(this.admin);
    }

    public boolean mainMenu(int choice) {

        System.out.println("Admin Menu");
        System.out.println("1. Add Item");
        System.out.println("2. Update Item");
        System.out.println("3. Remove Item");
        System.out.println("4. Add User");
        System.out.println("5. Remove User");
        System.out.println("6. Logout");

        System.out.println("--------------------------------------------------------------------------------");
        Command command;
        switch (choice) {
            case 0:
                System.out.println("Please make a choice");
                return true;

            case 1:
                System.out.println("Adding item");
                System.out.println("Current Items: ");
                System.out.println(this.items);
                Item item = new Item("a", "b", "c", 20, 30);
                this.adminCF.setItem(item);
                command = this.adminCF.createCommand("add item");
                command.execute();
                this.items = UtilFunctions.readFile("items");
                System.out.println(this.items);
                System.out.println("--------------------------------------------------------------------------------");
                return true;

            case 2:
                System.out.println("Coming soon");
                System.out.println("--------------------------------------------------------------------------------");

                return true;
            case 3:
                System.out.println("Coming soon");
                System.out.println("--------------------------------------------------------------------------------");

                return true;
            case 4:
                System.out.println("Coming soon");
                System.out.println("--------------------------------------------------------------------------------");

                return true;
            case 5:
                System.out.println("Removing User");
                System.out.println("Current users: ");
                System.out.println(this.users);
                User user = this.users.get(0);
                System.out.println("Removing user#1: " + user.getClass());
                adminCF.setUser(user);
                command = adminCF.createCommand("remove user");
                command.execute();
                System.out.println("Current users: ");
                this.users = UtilFunctions.readFile("users");
                System.out.println(this.users);
                return true;
            case 6:
                System.out.println("Logging out");
                System.out.println("--------------------------------------------------------------------------------");
                return false;
            default:
                System.out.println("Invalid choice");
                System.out.println("--------------------------------------------------------------------------------");

                return true;

        }
    }
}