package ro.sci.max;

import java.util.Scanner;

public class CalculateMax {

    public static void main(String[] args) {
        System.out.println(getMax());
    }

    public static int getMax() {
        Scanner s = new Scanner(System.in);
        int x = 0, y = 0, z = 0;
        for(int i = 0; i < 3; i++) {
            System.out.print("Enter an integer: ");
            while (!s.hasNextInt()) {
                s.next();
                System.out.print("Enter a number to continue: ");
            }
            if(i == 0) x = s.nextInt();
            else if(i == 1) y = s.nextInt();
            else z = s.nextInt();
        }
        if(getMax(x, y) < z) return z;
        else return getMax(x, y);
    }

    public static int getMax(int x, int y) {
        return Math.max(x, y);
    }
}
