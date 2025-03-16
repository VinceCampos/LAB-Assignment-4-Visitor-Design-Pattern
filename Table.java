public class Table implements Furniture {
    private String name;
    private double weight;
    private boolean isAssembled;
    
    public Table(String name, double weight, int quantity, boolean isAssembled) {
        this.name = name;
        this.weight = weight;
        this.isAssembled = isAssembled;
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
     
    public boolean isAssembled() {
        return isAssembled;
    }
}