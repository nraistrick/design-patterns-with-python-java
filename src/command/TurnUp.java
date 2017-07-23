package command;

public class TurnUp implements ICommand
{
    private Device device;

    public TurnUp(Device device)
    {
        this.device = device;
    }

    public void execute()
    {
        device.TurnUp();
    }

    public void undo()
    {
        device.TurnDown();
    }
}
