package strategy;

public class UpsShipper implements IShipper {
    public int calculateCost(Order order)
    {
        return order.getVolume() + order.getWeight();
    }
}
