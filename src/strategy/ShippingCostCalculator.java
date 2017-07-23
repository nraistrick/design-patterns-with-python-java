package strategy;

public class ShippingCostCalculator {

    private IShipper _shipper;

    public ShippingCostCalculator(IShipper shipper)
    {
        _shipper = shipper;
    }

    public void setShipper(IShipper shipper)
    {
        _shipper = shipper;
    }

    public int calculateCost(Order order)
    {
        return _shipper.calculateCost(order);
    }
}
