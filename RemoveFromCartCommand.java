public class RemoveFromCartCommand extends CustomerCommand {
    Item item;
    RemoveFromCartCommand (Customer customer, Item item) {
        this.customer = customer;
        this.item = item;

    }
    public boolean execute () {
        return true;
    }
}

