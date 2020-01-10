package ro.sci.data_validation;

import java.util.Scanner;

public class DataValidation {

    public static void main(String[] args) {
        while(true){
            time();
        }
    }

    public static void time() {
        Scanner s = new Scanner(System.in);
        System.out.println("What time is it? ");
        int[] time = new int[2];
        for(int i = 0; i < 2; i++) {
            time[i] = s.nextInt();
        }
        System.out.println(validation(time[0], time[1]));
    }

    public static String validation(int hours, int minutes) {

        if((hours > 24 || minutes > 59) || (hours < 0 || minutes < 0)) return "Incorrect time!";
        else return "The time is " + hours + ":" + minutes + " now";
    }
}
