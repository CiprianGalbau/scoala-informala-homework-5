package ro.sci.shop;

public class Computer extends ElectronicsProduct {
    private final int guarantee = 24;

    public Computer(String name, double price, int quantity) {
        super(name, price, quantity);
        setGuaranteePeriod(this.guarantee);
    }

    @Override
    public double getPrice() {
        if(getQuantity() > 1000) {
            return super.getPrice() * 0.95;
        } else return super.getPrice();
    }

}
