package lesson.lesson02;

import java.util.Scanner;

public class MultipleIfElse {
    public static void main(String[] args) {
//        <18: khong ban ruou bia
//                18-55:ok
//                >55: 2 chai

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your age: ");
        int userAge = scanner.nextInt();

        if (userAge < 18) {
            if (userAge <= 10) {
                System.out.println("Picturing");
                System.out.println("Call 911!");
            } else
                System.out.println("Khong ban");
        } else if (userAge <= 55) {
            System.out.println("OK");
        } else {
            System.out.println("2!");
        }
        System.out.println("See you again!");
    }
}
