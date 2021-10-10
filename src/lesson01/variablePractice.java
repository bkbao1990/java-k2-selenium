package lesson01;

import java.util.Scanner;

public class variablePractice {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your number: ");

        int inputNumber = scanner.nextInt();

        if (inputNumber % 2 == 0) {
            System.out.printf("Number %d is even number!", inputNumber);
        } else {
            System.out.printf("Number %d is odd number!", inputNumber);
        }

        int a = 3;
        int b = 4;

        boolean isABiggerThanB = a > b;

        /**
         * Allow user to input 2 numbers
         * Print out:
         * ----------
         *
         * Tong cua so %d va %d la %d
         * Hieu cua so %d va %d la %d
         * Tich cua so %d va %d la %d
         * Thuong cua so %d va %d la %d
         *
         */
    }
}
