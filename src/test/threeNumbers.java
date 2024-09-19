package test;

import java.util.Scanner;


/*
Three numbers
*/

public class threeNumbers {
    public static void main(String[] args) {
        //write your code here

        Scanner console = new Scanner(System.in);
        int number1 = console.nextInt();
        int number2 = console.nextInt();
        int number3 = console.nextInt();

        if (number1 == number2) {
            if (number1 == number3) {
                System.out.println(number1 + " " + number2 + " " + number3);
            } else {
                System.out.println(number1 + " " + number2);
            }
        } else if (number2 == number3) {
            System.out.println(number2 + " " + number3);
        } else if (number1 == number3) {
            System.out.println(number1 + " " + number3);
        }

    }
}


