package ro.sci.shop;

import java.util.*;

public class Main {
    private static Scanner scan = new Scanner(System.in);
    private static Product product;

    public static void main(String[] args) {

        Customer customer = new Customer("Tim", 16, 20.5);
        PurchaseManager manager = new PurchaseManager("John Doe");

        product = createProduct();
        product.setAgeRestriction();
        if(product instanceof FoodProduct) {
            ((FoodProduct)product).setExpiration();
        }

        manager.processPurchase(product, customer);

    }

    public static Product createProduct() {
        System.out.println("\n\tCreate product\n" +
                "Press #1 for food product.\n" +
                "Press #2 for electronics.\n");
        try {
            int option = scan.nextInt();

            System.out.print("Set product name: ");
            String name = scan.next();

            System.out.print("Set price: ");
            String num = scan.next();
            double price = Double.parseDouble(num);

            System.out.print("Set quantity: ");
            int quantity = scan.nextInt();

            if(option == 1 ) return new FoodProduct(name, price, quantity);
            else if(option == 2) return new ElectronicsProduct(name, price, quantity);
        } catch(InputMismatchException | NumberFormatException e) {
            System.out.println("Wrong input! " + e);
        }
        return null;
    }

}






