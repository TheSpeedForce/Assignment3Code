import java.io.Serializable;

abstract class CommandFactory implements Serializable{
    protected Command command;
    abstract Command createCommand (String commandName);
}