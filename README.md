CSCI 450 Assignment 3 Report
============================

## Overview

This is prototype for online store using Front Controller pattern and Command and Abstract Factory pattern. The front controller is used to handle login while command and factory is use to create functions for users.

To use RMI, a Front controller object is made. The server binds the controller object and the client uses it. 

## Execution

**Tesla**: Use makefile to make. Command: `make all`. For server: `run-server`. For client: `run-client`. (Need to transfer classes to rrpc machine #1 (rrpc01) and run rmiregistry at port 5000 to run-client at tesla successfully)

**rrpc machines**: Use following commands

##### rrpc01 command (server)
`bash autorunServer.sh`

##### rrpc02 command (client)
`bash autorunClient.sh`

## Files Overview

### Item.java
**Purpose**: Create item object for showing

**Properties**: name, type, description, cost, count

**Methods**: Getters, Setters, printItem


### User.java
**Purpose**: Create user object for using the program

**Properties**: username, password, name

**Methods**: Getters, Setters

### Admin.java
**Purpose**: Create admin object for showing, Inherits user

**Properties**: User properties

**Methods**: None


### Customer.java
**Purpose**: Create customer object for customer. inherits User

**Properties**: User properties, cart

**Methods**: None


### CustomerView.java
**Purpose**: Create customer view object for customer to use store. 

**Properties**:

**Methods**: None


### AdminView.java
**Purpose**: Create admin view object for admin to handle store.

**Properties**: 

**Methods**: None


### Store.java
**Purpose**: interface for creating store. Extends Remote for rmi

**Properties**: dispatcher

**Methods**: dispatchRequest(request)

### StoreFrontController.java
**Purpose**: Create store front controller object for login and using store

**Properties**: dispatcher

**Methods**: isAuthenticUser, trackRequest, dispatchRequest

### RemoteStoreFrontController.java
**Purpose**: Create store front controller object and bind to URL.

**Actions**: Create items, customer and admins for test data.

### ClientStoreFrontController.java
**Purpose**: Get store front controller object and run program.

**Actions**: Run login, loginCheck and browseItems for test





