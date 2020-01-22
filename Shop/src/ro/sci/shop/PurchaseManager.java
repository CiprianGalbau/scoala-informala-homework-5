package ro.sci.shop;

public class PurchaseManager {

    private String name;

    public PurchaseManager(String name) {
        this.name = name;
    }

    public static void processPurchase(Product product, Customer customer) {
        double balance = customer.getBalance() - product.getPrice();
        if(balance > 0) {
            if(product.getQuantity() > 0) {
                if(product.getAgeRestriction().equals(Product.AgeRestriction.ADULT)) {
                    if(customer.getAge() < 18) {
                        System.out.println("You are too young to buy this product!");
                    }
                } else if(product.getAgeRestriction().equals(Product.AgeRestriction.TEENAGER)) {
                        if(customer.getAge() < 13) {
                            System.out.println("You are too young to buy this product!");
                        }
                } else {
                    customer.setBalance(balance);
                    product.setQuantity(product.getQuantity() - 1);
                }
            } else {
                System.out.println("Product is unavailable!");
            }
        } else {
            System.out.println("You do not have enough money to buy this product");
        }

        if(balance == customer.getBalance()) System.out.println("You have purchased " + product.getName());
    }


}
