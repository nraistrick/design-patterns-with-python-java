package command;

public enum CommandText
{
    TURN_LIGHT_ON("Turn on the light"),
    TURN_RADIO_ON("Turn on the radio");

    private final String message;

    private CommandText(String message)
    {
        this.message = message;
    }

    public String getMessage()
    {
        return this.message;
    }
}
