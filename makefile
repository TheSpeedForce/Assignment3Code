
all: clean Item.class User.class Customer.class Command.class AdminCommand.class AddItemCommand.class UpdateItemCommand.class RemoveItemCommand.class AddUserCommand.class RemoveUserCommand.class CustomerCommand.class AddToCartCommand.class RemoveFromCartCommand.class PurchaseCartCommand.class CommandFactory.class AdminCommandFactory.class CustomerCommandFactory.class UtilFunctions.class AdminView.class CustomerView.class Dispatcher.class Store.class StoreFrontController.class RemoteStoreFrontController.class ClientStoreFrontController.class

Item.class: Item.java
	javac Item.java

User.class: User.java
	javac User.java

Admin.class: Admin.java User.class Item.class
	javac Admin.java

Customer.class: Customer.java User.class Item.class
	javac Customer.java

Command.class: Command.java
	javac Command.java

AdminCommand.class: AdminCommand.java Command.class Admin.class
	javac AdminCommand.java

AddItemCommand.class: AddItemCommand.java AdminCommand.class
	javac AddItemCommand.java

UpdateItemCommand.class: UpdateItemCommand.java AdminCommand.class
	javac UpdateItemCommand.java

RemoveItemCommand.class: RemoveItemCommand.java AdminCommand.class
	javac RemoveItemCommand.java

AddUserCommand.class: AddUserCommand.java AdminCommand.class
	javac AddUserCommand.java

RemoveUserCommand.class: RemoveUserCommand.java AdminCommand.class
	javac RemoveUserCommand.java

CustomerCommand.class: CustomerCommand.java Command.class Customer.class
	javac CustomerCommand.java

BrowseItemsCommand.class: BrowseItemsCommand.java CustomerCommand.class
	javac BrowseItemsCommand.java

AddToCartCommand.class: AddToCartCommand.java CustomerCommand.class
	javac AddToCartCommand.java

RemoveFromCartCommand.class: RemoveFromCartCommand.java CustomerCommand.class
	javac RemoveFromCartCommand.java

PurchaseCartCommand.class: PurchaseCartCommand.java CustomerCommand.class
	javac PurchaseCartCommand.java

CommandFactory.class: CommandFactory.java Command.class
	javac CommandFactory.java

AdminCommandFactory.class: AdminCommandFactory.java AdminCommand.class
	javac AdminCommandFactory.java

CustomerCommandFactory.class: CustomerCommandFactory.java CustomerCommand.class
	javac CustomerCommandFactory.java

UtilFunctions.class: UtilFunctions.java AdminCommandFactory.class CustomerCommandFactory.class
	javac UtilFunctions.java

AdminView.class: AdminView.java Admin.class
	javac AdminView.java

CustomerView.class: CustomerView.java Customer.class
	javac CustomerView.java

Dispatcher.class: Dispatcher.java AdminView.class CustomerView.class
	javac Dispatcher.java

Store.class: Store.java Admin.class Customer.class
	javac Store.java

StoreFrontController.class: StoreFrontController.java Store.class  Admin.class AdminView.class Customer.class CustomerView.class User.class Item.class
	javac StoreFrontController.java

RemoteStoreFrontController.class: RemoteStoreFrontController.java StoreFrontController.class Store.class  Admin.class Customer.class User.class Item.class
	javac RemoteStoreFrontController.java

ClientStoreFrontController.class: ClientStoreFrontController.java StoreFrontController.class Store.class  Admin.class Customer.class User.class Item.class
	javac ClientStoreFrontController.java

clean:
	rm -rf *.class

run-server: RemoteStoreFrontController.class
	java RemoteStoreFrontController

run-client: ClientStoreFrontController.class
	java ClientStoreFrontController