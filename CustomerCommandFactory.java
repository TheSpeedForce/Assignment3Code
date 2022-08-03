public class CustomerCommandFactory extends CommandFactory {
    Customer customer = new Customer();
    Item item = new Item();

    CustomerCommandFactory (Customer customer){
        this.customer = customer;
    }

    public void setItem (Item item) {
        this.item = item;
    }

    public Command createCommand(String commandName){
        
        if (commandName.equalsIgnoreCase("browse items")){
            command = new BrowseItemsCommand (customer);
        }

        if (commandName.equalsIgnoreCase("add to cart")){
            command = new AddToCartCommand (customer, item);
        }

        if (commandName.equalsIgnoreCase("remove from cart")){
            command = new RemoveFromCartCommand (customer, item);
        }
        
        if (commandName.equalsIgnoreCase("purchase cart")){
            command = new PurchaseCartCommand (customer);
        }
        
        return command;
    }
}
