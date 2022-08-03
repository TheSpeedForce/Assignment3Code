import java.util.Scanner;
import java.util.Vector;

public class BrowseItemsCommand extends CustomerCommand {
    Vector <Item> items = UtilFunctions.readFile("items");
    public BrowseItemsCommand (Customer customer) {
        this.customer = customer;
    }

    public boolean execute () {
        
        System.out.println("Available items");
        for (int index = 0; index < items.size(); index++) {
            Item item = items.get(index);
            if (item != null) {
                System.out.println(" ");
                System.out.println(item);                
                System.out.println("Name: " + item.getName());
                System.out.println("Type: " + item.getType());
                System.out.println("Description: " + item.getDescription());
                System.out.println("Cost: " + String.valueOf(item.getCost()));
                System.out.println("Count: " + String.valueOf(item.getCount()));
                System.out.println(" ");
            }
        }
        System.out.println("--------------------------------------------------------------------------------");
        return true;
    }
}

