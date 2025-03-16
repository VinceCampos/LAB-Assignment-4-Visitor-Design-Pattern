public class FurnitureShipping {
    public static void main(String[] args) {
        Furniture chair = new Chair("Gaming Chair", 13.6);
        Furniture table = new Table("Round Dining Table", 20.0, 5, true);
        Furniture sofa = new Sofa("Sectional Sofa", 77.5, "polyester");
        
        Furniture[] shoppingCart = {chair, table, sofa};
        
        System.out.println("\n====================== Standard Shipping ======================");
        ShippingCost standardShipping = new StandardShippingVisitor();
        for (Furniture item : shoppingCart) {
            item.accept(standardShipping);
        }
        System.out.println("\nTotal standard shipping cost: $" + standardShipping.getTotalCost());
          
        System.out.println("\n============================ Distance-Based Shipping ============================");
        ShippingCost distanceShipping = new DistanceBasedShippingVisitor(300);
        for (Furniture item : shoppingCart) {
            item.accept(distanceShipping);
        }
        System.out.println("\nTotal distance-based shipping cost: $" + distanceShipping.getTotalCost());
    }
}