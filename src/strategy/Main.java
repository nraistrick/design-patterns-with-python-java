package strategy;

import strategy.*;

public class Main
{
    public static void main(String[] args)
    {
        Order order = new Order(100, 100);
        IShipper shipper = new FedexShipper();
        ShippingCostCalculator shippingCostCalculator = new ShippingCostCalculator(shipper);

        int shippingCost = shippingCostCalculator.calculateCost(order);
        System.out.println(String.format("Shipping cost is %d", shippingCost));

        IShipper someOtherShipper = new PostalShipper();
        shippingCostCalculator.setShipper(someOtherShipper);

        shippingCost = shippingCostCalculator.calculateCost(order);
        System.out.println(String.format("Shipping cost is %d", shippingCost));
    }
}
