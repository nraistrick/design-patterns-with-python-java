package strategy;

public class FedexShipper implements IShipper {
    public int calculateCost(Order order)
    {
        return order.getVolume() * 3 + order.getWeight() * 2;
    }
}
