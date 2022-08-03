import java.util.*;

public class CustomerView implements UserView {
    private Customer customer;
    private CustomerCommandFactory customerCF;
    private Vector<Item> items;

    public CustomerView() {
    }

    public CustomerView(String username, String password) {
        User user = UtilFunctions.getUser(username, password);
        this.customer = new Customer(user);
        this.items = UtilFunctions.readFile("items");
        this.customerCF = new CustomerCommandFactory(customer);
    }

    public boolean mainMenu(int choice) {

        System.out.println("Customer Menu:");
        System.out.println("1. Browse Items");
        System.out.println("2. Add item to cart");
        System.out.println("3. Purchase Cart.");
        System.out.println("4. Log out");
        System.out.println("--------------------------------------------------------------------------------");

        Command command;

        switch (choice) {
            case 0:
                System.out.println("Please make a choice");
                return true;
            case 1:
                command = customerCF.createCommand("browse items");
                command.execute();
                return true;
            case 2:
                System.out.println("Current Cart and orders");

                System.out.println("Cart");
                System.out.println(this.customer.getCart());
                System.out.println("Orders");
                System.out.println(this.customer.getOrders());
                System.out.println("--------------------------------------------------------------------------------");

                System.out.println("Adding item to Cart");

                int itemNum = 1;
                Item item = items.get(itemNum);
                customerCF.setItem(item);
                command = customerCF.createCommand("add to cart");
                command.execute();

                System.out.println("Cart");
                System.out.println(this.customer.getCart());
                System.out.println("Orders");
                System.out.println(this.customer.getOrders());
                System.out.println("--------------------------------------------------------------------------------");
                return true;
            case 3:
                System.out.println("Purchasing Cart");
                command = customerCF.createCommand("purchase cart");
                command.execute();
                System.out.println("Cart");
                System.out.println(this.customer.getCart());
                System.out.println("Orders");
                System.out.println(this.customer.getOrders());
                System.out.println("--------------------------------------------------------------------------------");
                return true;

            case 4:
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
