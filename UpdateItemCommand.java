public class UpdateItemCommand extends AdminCommand {
    Item item;
    public UpdateItemCommand (Admin admin, Item item) {
        this.admin = admin;
        this.item = item;
    }
    public boolean execute () {
        return true;
    }
}
