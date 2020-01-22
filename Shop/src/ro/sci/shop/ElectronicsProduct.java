package ro.sci.shop;

public class ElectronicsProduct extends Product {
    protected int guaranteePeriod;

    public ElectronicsProduct(String name, double price, int quantity) {
        super(name, price, quantity);
        this.guaranteePeriod = guaranteePeriod;
    }

    public int getGuaranteePeriod() {
        return guaranteePeriod;
    }

    public int setGuaranteePeriod(int guaranteePeriod) {
        return this.guaranteePeriod = guaranteePeriod;
    }


}
