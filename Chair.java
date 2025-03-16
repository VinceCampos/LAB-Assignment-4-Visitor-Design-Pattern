public class Chair implements Furniture {
    private String name;
    private double weight;
    
    public Chair(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }
    
    @Override
    public void accept(ShippingCost visitor) {
        visitor.visit(this);
    }
    
    @Override
    public String getName() {
        return name;
    }
    
    @Override
    public double getWeight() {
        return weight;
    }
}