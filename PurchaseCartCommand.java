import java.util.Vector;

public class PurchaseCartCommand extends CustomerCommand {
    PurchaseCartCommand(Customer customer) {
        this.customer = customer;
    }

    public boolean execute() {
        Vector<Item> cart = this.customer.getCart();
        Vector<Item> orders = this.customer.getOrders();
        orders.addAll(cart);
        cart.clear();
        this.customer.setOrders(orders);
        return true;
    }
}
