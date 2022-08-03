import java.util.*;

public class Admin extends User{

    protected Vector<Item> items = new Vector <Item> ();
    protected Vector<User> users = new Vector <User> ();

    public Admin () {
    }
    public Admin (User user){
        super(user.getUsername(), user.getPassword(), user.getName());
        
    }
    public Admin (String username, String password, String name){
        super(username, password, name);
    }

    public Vector <Item> getItems () {
        return this.items;
    }
    public Vector <User> getUsers () {
        return this.users;
    }

    public void setItems (Vector <Item> items) {
        this.items = items;
    }
    public void setUsers (Vector <User> users) {
        this.users = users;
    }
}

