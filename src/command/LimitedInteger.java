package command;

public class LimitedInteger
{
    private int value;
    private int min;
    private int max;

    LimitedInteger(int value, int min, int max)
    {
        checkValidLimits(min, max);
        this.min = min;
        this.max = max;

        this.setValue(value);
    }

    public void increase()
    {
        this.setValue(getValue() + 1);
    }

    public void decrease()
    {
        this.setValue(getValue() - 1);
    }

    public int getValue()
    {
        return value;
    }

    public void setValue(int value)
    {
        checkWithinBounds(value);
        this.value = value;
    }

    private void checkValidLimits(int min, int max)
    {
        if(min > max)
        {
            String message = String.format("Invalid minimum (%d) and maximum (%d) combination", min, max);
            throw new IllegalArgumentException(message);
        }
    }

    private void checkWithinBounds(int value)
    {
        if(value < min || value > max)
        {
            String message = String.format("Value outside of valid range %d-%d", min, max);
            throw new IllegalArgumentException(message);
        }
    }
}
