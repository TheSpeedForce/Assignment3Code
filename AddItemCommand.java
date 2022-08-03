import java.util.Vector;

public class AddItemCommand extends AdminCommand {
    Item item;

    public AddItemCommand(Admin admin, Item item) {
        this.admin = admin;
        this.item = item;
    }

    public boolean execute() {
        boolean executed = false;
        try {

            Vector<Item> items = UtilFunctions.readFile("items");
            items.add(item);
            UtilFunctions.writeFile(items, "items");

        } catch (Exception ex) {
            System.out.println(ex);
        }
        return executed;
    }
}
