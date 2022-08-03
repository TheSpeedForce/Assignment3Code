
public class AdminCommandFactory extends CommandFactory {
    Admin admin = new Admin ();
    Item item = new Item ();
    User user = new User ();

    public AdminCommandFactory (Admin admin){
        this.admin = admin;
    }

    public void setItem (Item item) {
        this.item = item;
    }

    public void setUser (User user) {
        this.user = user;
    }

    public Command createCommand(String commandName){
        if (commandName.equalsIgnoreCase("add item")){
            command = new AddItemCommand (this.admin, this.item);
        }
        else if (commandName.equalsIgnoreCase("update item")){
            command = new UpdateItemCommand (this.admin, this.item);
        }
        else if (commandName.equalsIgnoreCase("remove item")){
            command = new RemoveItemCommand (this.admin, this.item);
        }
        else if (commandName.equalsIgnoreCase("add user")){
            command = new AddUserCommand (this.admin, this.user);
        }
        else if (commandName.equalsIgnoreCase("remove user")){
            command = new RemoveUserCommand (this.admin, this.user);
        }
        return command;
    }
}
