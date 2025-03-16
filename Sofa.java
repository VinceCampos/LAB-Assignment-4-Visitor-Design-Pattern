public class Sofa implements Furniture {
    private String name;
    private double weight;
    private String material;
    
    public Sofa(String name, double weight, String material) {
        this.name = name;
        this.weight = weight;
        this.material = material;
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
    
    public String getMaterial() {
        return material;
    }
}