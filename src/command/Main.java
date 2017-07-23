package command;

public class Main
{
    public static void main(String[] args)
    {
        Invoker invoker = new Invoker();
        ICommand command = invoker.getCommand("Turn on the radio");
        Receiver.execute(command);
    }
}