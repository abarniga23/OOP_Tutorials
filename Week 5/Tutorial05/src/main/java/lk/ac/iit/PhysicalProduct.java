package lk.ac.iit;

// A PhysicalProduct IS-A Product because it is a type of product with physical properties.
// A ShoppingCart HAS-A Product because it contains products rather than being a product.

public class PhysicalProduct extends Product implements Discountable {

    private double weightKg;
    private String dimensions;

    private double discountedPrice;

    public PhysicalProduct(){

    }

    public PhysicalProduct(Long id, String name, double price, double weightKg, String dimensions){
        super(id, name, price);
        this.weightKg = weightKg;
        this.dimensions = dimensions;
    }

    public double getWeightKg() {
        return weightKg;
    }

    public void setWeightKg(double weightKg){
        this.weightKg = weightKg;
    }

    public String getDimensions() {
        return dimensions;
    }

    public void setDimensions(String dimensions){
        this.dimensions = dimensions;
    }

    @Override
    public String getSummary(){
        return "Physical: " + getName() + " | Weight: " + weightKg;

    }

    @Override
    public void applyDiscount(double rate) {
        double cappedRate = Math.min(rate,0.20);
        this.discountedPrice = getPrice()*(1-cappedRate);
    }

    @Override
    public double getDiscountedPrice() {
        return discountedPrice;
    }
}
