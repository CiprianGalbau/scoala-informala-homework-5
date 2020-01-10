package ro.sci.ro.sci.duplicate_removal;

import java.util.Scanner;

public class DuplicateRemoval {

    public static void main(String[] args) {
        array();
    }

    public static  void array() {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter length of the array: ");

        while(!s.hasNextInt()) {
            s.next();
            System.out.print("Enter length of the array: ");
        }
        int length = s.nextInt();

        int[] arr = new int[length];
        for(int i = 0; i < arr.length; i++){
            System.out.print("Enter character #" + (i+1) + ": ");

            while(!s.hasNextInt()) {
                s.next();
                System.out.print("Enter a number: ");
            }
            int num = s.nextInt();
            if(isDuplicate(arr, num)) {
                System.out.println("You have entered a duplicate. ");
                i--; continue;
            }
            arr[i] = num;
        }
        for(int i = 0; i < arr.length; i++) {
            System.out.println("Character #" + (i+1) + ": " + arr[i]);
        }
    }

    public static boolean isDuplicate(int[] arr, int num) {
        for(int i = 0; i < arr.length; i++) {
          if(arr[i] == num) return true;
        }
        return false;
    }

}
