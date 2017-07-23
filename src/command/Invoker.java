package command;

import java.util.HashMap;

/**
 * Maps string command line input to actual commands
 */
public class Invoker
{
    private HashMap<String, ICommand> commandLookupTable;

    public Invoker()
    {
        this.commandLookupTable = this.createCommandLookupTable();
    }

    public Invoker(HashMap<String, ICommand> commandLookupTable)
    {
        this.commandLookupTable = commandLookupTable;
    }

    public ICommand getCommand(String command)
    {
        return commandLookupTable.get(command);
    }

    private HashMap<String, ICommand> createCommandLookupTable()
    {
        Device light = new Light();
        Device radio = new Radio();

        ICommand switchOnLightCommand = new SwitchOn(light);
        ICommand switchOnRadioCommand = new SwitchOn(radio);

        HashMap<String, ICommand> commandLookupTable = new HashMap<>();
        commandLookupTable.put(CommandText.TURN_LIGHT_ON.getMessage(), switchOnLightCommand);
        commandLookupTable.put(CommandText.TURN_RADIO_ON.getMessage(), switchOnRadioCommand);

        return commandLookupTable;
    }
}
