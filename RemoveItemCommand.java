public class RemoveItemCommand extends AdminCommand {
    Item item;
    public RemoveItemCommand (Admin admin, Item item) {
        this.admin = admin;
        this.item = item;
    }
    public boolean execute () {
        return true;
    }
}
