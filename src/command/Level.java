package command;

class Level extends LimitedInteger
{
    public static int MIN_LEVEL = 0;
    public static int MAX_LEVEL = 11;

    Level()
    {
        super(MIN_LEVEL, MIN_LEVEL, MAX_LEVEL);
    }

    Level(int currentValue)
    {
        super(currentValue, MIN_LEVEL, MAX_LEVEL);
    }
}
