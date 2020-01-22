package ro.sci.shop;

public class Appliance extends ElectronicsProduct{
    private final int guarantee = 6;
    
    public Appliance(String name, double price, int quantity) {
        super(name, price, quantity);
        setGuaranteePeriod(this.guarantee);
    }

    @Override
    public double getPrice() {
        if(getQuantity() < 50) {
            return super.getPrice() * 1.05;
        } else return super.getPrice();
    }

    public int getGuarantee() {
        return guarantee;
    }
}
