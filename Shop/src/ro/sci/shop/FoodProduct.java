package ro.sci.shop;

import java.util.Calendar;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FoodProduct extends Product implements Expirable {
    private Date expiration;

    public FoodProduct(String name, double price, int quantity) {
        super(name, price, quantity);
    }

    @Override
    public Date getExpirationDate() {
        return expiration;
    }

    public void setExpiration() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Set expiration date");
        try {
            Calendar calendar = Calendar.getInstance();
            System.out.print("Set day: ");
            calendar.set(Calendar.DATE, scan.nextInt());
            System.out.print("Set month: ");
            calendar.set(Calendar.MONTH, scan.nextInt());
            System.out.print("Set year: ");
            calendar.set(Calendar.YEAR, scan.nextInt());
            this.expiration = calendar.getTime();
        } catch (InputMismatchException e) {
            System.out.println("Wrong input! " + e);
        }
    }
}
