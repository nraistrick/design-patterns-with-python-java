package command;

public class Receiver
{
    public static void execute(ICommand command)
    {
        command.execute();
    }
}
