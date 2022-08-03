public class AddUserCommand extends AdminCommand {
    User user;

    public AddUserCommand (Admin admin, User user) {
        this.admin = admin;
        this.user = user;
    }
    public boolean execute () {
        return true;
    }
}

