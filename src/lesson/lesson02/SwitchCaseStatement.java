package lesson.lesson02;

import java.util.Scanner;

public class SwitchCaseStatement {
    public static void main(String[] args) {
        /*
        *  giai nhat
        *  giai 2
        *  giai 3
        *
        * */

        Scanner scanner = new Scanner(System.in);
        System.out.println("input number:");
        int price = scanner.nextInt();

        switch (price){
            case 1:
                System.out.println("Giai nhat!");
                System.out.println("Hooray");
                break;
            case 2:
                System.out.println("Giai nhi!");
                break;
            case 3:
                System.out.println("Giai ba!");
                break;
            default:
                System.out.println("Chuc ban may man lan sau!");
        }

        switch (price){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Week Day!");
                break;
            case 7:
            case 8:
                System.out.println("Weekend!");
                break;
            default:
                System.out.println("N/A");
        }
    }
}
