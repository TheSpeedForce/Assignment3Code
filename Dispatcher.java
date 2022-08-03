import java.util.*;
public class Dispatcher {

	private AdminView adminView;
	private CustomerView customerView;

	public Dispatcher() {
		adminView = new AdminView();
		customerView = new CustomerView();
	}

	public UserView dispatch (ArrayList <String> request) {
		String type = request.get(0);
		String username = request.get(1);
		String password = request.get(2);
		if (type.equalsIgnoreCase("Customer") ) {
			System.out.println("Dispatcher : dispatching request to customerView");
			customerView = new CustomerView(username, password);
			return customerView;
		}
		else {
			System.out.println("Dispatcher : dispatching request to AdminView");
			adminView = new AdminView(username, password);
			return adminView;
		}
	}
}
