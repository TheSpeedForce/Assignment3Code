import java.rmi.*;
import java.util.*;
public interface Store extends Remote {
    Dispatcher dispatcher = null;


    public UserView dispatchRequest (ArrayList <String> request) throws RemoteException;
}



	
	