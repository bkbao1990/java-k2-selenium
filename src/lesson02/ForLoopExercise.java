package lesson02;

import java.util.Scanner;

public class ForLoopExercise {
    public static void main(String[] args) {
        /*
         *  ***
         *  **
         *  *
         *
         *
         *
         * */

        Scanner scanner = new Scanner(System.in);
        System.out.println("input number:");
        int inputNumber = scanner.nextInt();

        for (int currentNumber = inputNumber; currentNumber > 0; currentNumber--) {
//            for (int index = 1; index <= currentNumber; index++) {
//                System.out.print("*");
//            }
//            System.out.println();
            for (int index = inputNumber; index >= currentNumber; index--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
