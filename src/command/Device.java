package command;

class Device
{
    private boolean isOn = false;
    private Level level = new Level();
    private String name = this.getClass().getName();

    public boolean isOn()
    {
        return this.isOn;
    }

    public void SwitchOn()
    {
        this.isOn = true;
        String message = String.format("%s turned on", this.name);
        System.out.println(message);
    }

    public void SwitchOff()
    {
        this.isOn = false;
        String message = String.format("%s turned off", this.name);
        System.out.println(message);
    }

    public void TurnUp()
    {
        this.level.increase();
        String message = String.format("%s turned up", this.name);
        System.out.println(message);
    }

    public void TurnDown()
    {
        this.level.decrease();
        String message = String.format("%s turned down", this.name);
        System.out.println(message);
    }
}
