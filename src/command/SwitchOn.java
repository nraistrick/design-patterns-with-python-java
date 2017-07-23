package command;

public class SwitchOn implements ICommand
{
    private Device device;

    public SwitchOn(Device device)
    {
        this.device = device;
    }

    public void execute()
    {
        device.SwitchOn();
    }

    public void undo()
    {
        device.SwitchOff();
    }
}
