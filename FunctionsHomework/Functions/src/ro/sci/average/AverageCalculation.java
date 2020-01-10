package ro.sci.average;

import java.util.Scanner;

public class AverageCalculation {

    public static void main(String[] args) {
        System.out.println("The average is: " + average(array()));
    }

    public static double average(double[] arr) {
        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum / arr.length;
    }

    public static double[] array() {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter length of the array: ");

        while(!s.hasNextInt()) {
            s.next();
            System.out.print("Enter length of the array: ");
        }
        int length = s.nextInt();

        double[] arr = new double[length];
        for(int i = 0; i < arr.length; i++){
            System.out.print("Enter character #" + (i+1) + ": ");

            while(!s.hasNextDouble()) {
                s.next();
                System.out.print("Enter a number: ");
            }
            arr[i] = s.nextDouble();
        }

        return arr;
    }
}
