import java.util.*;
import java.io.*;

public class UtilFunctions {

    public static User getUser (String username, String password){
        User user = null;
        Vector users = readFile("users");
        for (int i = 0; i < users.size(); i++){
            User temp = (User)users.get(i);
            if (temp.getUsername().equals(username)){
                System.out.println("username found");
                if (temp.getPassword().equals(password)){
                    user = temp;
                }
                break;
            }
        }
        return user;
    }
    
    public static Vector readFile (String filename){
	
        Vector fileData = null;

        try {
            FileInputStream file = new FileInputStream(filename + ".dat"); //create file object for input
            ObjectInputStream object = new ObjectInputStream(file);
            fileData = (Vector)object.readObject();
            object.close();                                                            //close input file      
            
        }
        catch (IOException ex){
	  	    fileData = new Vector();
		}
        catch (ClassNotFoundException ex){                      				      //check for errors
			System.out.println("ClassNotFoundException occured");
		}
        return fileData;

    }
    public static void writeFile(Vector fileData, String filename){
        try{
            FileOutputStream file = new FileOutputStream(filename + ".dat");
            ObjectOutputStream object = new ObjectOutputStream(file);									
            object.writeObject(fileData);                                                          //save and close output file
            file.close();
            object.close();
        }
        catch(Exception e){
            System.out.println("IOException occured");
        }
    }
}
