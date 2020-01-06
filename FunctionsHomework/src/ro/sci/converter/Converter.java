package ro.sci.converter;

import java.util.Scanner;

public class Converter {

    public static void main(String[] args) {
        fahrenheitToCelsiusConverter();
    }

    public static void fahrenheitToCelsiusConverter() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter temperature: ");

        while(!s.hasNextInt()) {
            System.out.print("Enter a number: ");
            s.next();
        }

        int celsiusDegrees = fahrenheitToCelsiusConverter(s.nextInt());
        System.out.println("Your body temperature in Celsius degrees is " + celsiusDegrees);
        if (celsiusDegrees > 37) System.out.println("You are ill!");
    }

    public static int fahrenheitToCelsiusConverter(int fahrenheitDegrees) {
        return (fahrenheitDegrees - 32) * 5 / 9;
    }
}
