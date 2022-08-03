import java.util.*;

public class Customer extends User {
    protected Vector<Item> cart = new Vector<Item>();
    protected Vector<Item> orders = new Vector<Item>();

    public Customer() {
        super();
        this.cart = new Vector<Item>();
        this.orders = new Vector<Item>();
    }

    public Customer(User user) {
        super(user.getUsername(), user.getPassword(), user.getName());
        this.cart = new Vector<Item>();
        this.orders = new Vector<Item>();
    }

    public Customer(String username, String password, String name) {
        super(username, password, name);
        this.cart = new Vector<Item>();
        this.orders = new Vector<Item>();
    }

    public Customer(String username, String password, String name, Vector<Item> cart) {
        super(username, password, name);
        this.cart = cart;
        this.orders = new Vector<Item>();
    }

    public Vector<Item> getCart() {
        return this.cart;
    }

    public Vector<Item> getOrders() {
        return this.orders;
    }

    public void setCart(Vector<Item> cart) {
        this.cart = cart;
    }

    public void setOrders(Vector<Item> orders) {
        this.orders = orders;
    }
}
