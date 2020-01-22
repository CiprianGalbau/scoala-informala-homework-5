package ro.sci.shop;

import java.util.Scanner;

public abstract class Product implements Buyable {
    private final String name;
    private double price;
    private int quantity;
    private AgeRestriction ageRestriction;

    enum AgeRestriction {
        NONE,
        TEENAGER,
        ADULT;
    }

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.ageRestriction = AgeRestriction.NONE;
    }

    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public AgeRestriction getAgeRestriction() {
        return ageRestriction;
    }

    protected void setAgeRestriction() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Set age restriction to teenager, adult or none: ");
        String restriction = scan.next();

        if(restriction.equals("teenager")) this.ageRestriction = AgeRestriction.TEENAGER;
        else if(restriction.equals("adult")) this.ageRestriction = AgeRestriction.ADULT;
        else this.ageRestriction = AgeRestriction.NONE;
    }
}
