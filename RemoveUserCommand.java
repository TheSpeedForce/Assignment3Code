import java.util.Vector;

public class RemoveUserCommand extends AdminCommand {
    User user;
    public RemoveUserCommand (Admin admin, User user) {
        this.admin = admin;
        this.user = user;
    }
    public boolean execute () {
        boolean executed = false;
        try {
            Vector <User> users = UtilFunctions.readFile("users");
            for (int index = 0; index < users.size(); index++) {
                User user = users.get(index);
                if (user.getUsername().equals(this.user.getUsername())){
                    users.remove(index);
                    break;
                }
            }
            UtilFunctions.writeFile(users, "users");

        }
        catch (Exception ex){
            System.out.println(ex);
        };
        return executed;
    }
}
