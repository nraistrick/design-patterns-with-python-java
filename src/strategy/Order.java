package strategy;

public class Order
{
    private int _weightInKg;
    private int _volumeInCmCubed;

    public Order(int weightInKg, int volumeInCmCubed)
    {
        _weightInKg = weightInKg;
        _volumeInCmCubed = volumeInCmCubed;
    }

    public int getWeight()
    {
        return _weightInKg;
    }

    public int getVolume()
    {
        return _volumeInCmCubed;
    }
}