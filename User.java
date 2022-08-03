// git command
// git add . && git commit -m "15-nov-21 18:20" && git push origin master
import java.io.Serializable;
public class User implements Serializable{
    protected String username;
    protected String password;
    protected String name;


    // Constructors
    public User(){
        this.username = "";
        this.password = "";
        this.name = "";

    }

    public User(String username, String password, String name){
        this.username = username;
        this.password = password;
        this.name = name;
    }

    // Getters
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getName(){
        return this.name;
    }

    // Setters
    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setName (String name){
        this.name = name;
    }
}