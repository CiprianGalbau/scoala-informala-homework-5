package ro.sci.homework;

public class IntroToJava {

    public static void main(String[] args) {

        //System.out.println(sumOfNumbers());
        //System.out.println(isPalindrome(122221));
        //rectangle(12, -1);
        //biggestNumber(121, 4, 22);
        //startToFinish(4, 11);
    }

    /**
     * Calculate the sum of the first 100 numbers higher than 0.
     */
    public static int sumOfNumbers() {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        return sum;
    }

    /**
     * Check if a number is palindrome (e.g. 1221, 34143).
     */

    public static boolean isPalindrome(int num) {
        int reversedNum = 0;
        int originalNum = num;
        while (num != 0) {
            int remainder = num % 10;
            reversedNum = reversedNum * 10 + remainder;
            num = num / 10;
        }

        if (originalNum == reversedNum) return true;
        return false;
    }

    /**
     * Input the dimensions of a rectangle(Length, Width) and display area and perimeter.
     * Produce an error message if the length or width are negative.
     */

    public static void rectangle(double length, double width) {
        if (length < 0 || width < 0) {
            System.out.println("Length or width cannot be negative!");
        } else {
            System.out.println("The area of the rectangle is: " + (length * width));
            System.out.println("The perimeter of the rectangle is: " + (2 * (length + width)));
        }
    }

    /**
     * Input 3 numbers, and display the biggest.
     */

    public static void biggestNumber(int x, int y, int z) {
        if (x > y && x > z) {
            System.out.println(x + " is the biggest number.");
        } else if (y > z) {
            System.out.println(y + " is the biggest number.");
        } else {
            System.out.println(z + " is the biggest number.");
        }
    }

    /**
     * Input 2 values:  start  and  finish, then display the numbers from start to finish.
     */

    public static void startToFinish(int start, int finish) {
        for (int i = start; i <= finish; i++) {
            System.out.print("#" + i + " ");
        }
    }


}
