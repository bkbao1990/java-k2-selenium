package lesson03;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.security.SecureRandom;
import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        // {1,....,9} random pickup 1 number
        // 3 time to guess
        int[] guessingNumArr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int randomNum = guessingNumArr[new SecureRandom().nextInt(guessingNumArr.length -1)];
        System.out.println("random num:" + randomNum);
        int guessingTime = 0;
        final int Max_Guessing = 9;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Input number 0 -> 9: ");
            int userNumber = scanner.nextInt();
            if (userNumber == randomNum){
                System.out.println("Hooray!!!");
                break;
            }
            guessingTime++;
        } while (guessingTime < Max_Guessing);
        System.out.println("See you next time");
    }
}
