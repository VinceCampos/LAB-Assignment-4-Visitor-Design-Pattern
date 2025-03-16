public interface Furniture {
    void accept(ShippingCost visitor);
    String getName();
    double getWeight();
}