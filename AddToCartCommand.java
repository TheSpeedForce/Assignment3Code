import java.util.Vector;

public class AddToCartCommand extends CustomerCommand {
    Item item;

    public AddToCartCommand(Customer customer, Item item) {
        this.customer = customer;
        this.item = item;
    }

    public boolean execute() {
        Vector<Item> cart = this.customer.getCart();
        cart.add(this.item);
        this.customer.setCart(cart);
        return true;

    }
}
