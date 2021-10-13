package lesson.lesson01;

import java.util.Scanner;

public class HomeWork1 {
    public static void main(String[] args) {

        int multiple;
        int plus;
        int divide;
        int minus;

        // Call out the input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input Your 1st Number: ");
        int firstNum = scanner.nextInt();
        System.out.println("Input Your 2nd Number: ");
        int secondNum = scanner.nextInt();

        //  Check with Number is bigger to perform Calculate
        if (firstNum > secondNum) {
            minus = firstNum - secondNum;
            divide = firstNum / secondNum;
        } else {
            minus = secondNum - firstNum;
            divide = secondNum / firstNum;
        }

        multiple = firstNum * secondNum;
        plus = firstNum + secondNum;

        // Printout the Results
        System.out.printf("Tong cua so %d va %d la %d \n", firstNum, secondNum, plus);
        System.out.printf("Hieu cua so %d va %d la %d \n", firstNum, secondNum, minus);
        System.out.printf("Tich cua so %d va %d la %d \n", firstNum, secondNum, multiple);
        System.out.printf("Thuong cua so %d va %d la %d \n", firstNum, secondNum, divide);
    }
}
