package strategy;

public class PostalShipper implements IShipper {
    public int calculateCost(Order order)
    {
        return order.getVolume() * 2 + order.getWeight() * 6;
    }
}
