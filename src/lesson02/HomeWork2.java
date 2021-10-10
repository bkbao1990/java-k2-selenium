package lesson02;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Practice 00 line 112
 * Practice 01 line 123
 * Practice 02 line 132
 * Practice 03 & 04 line 142
 * Practice 05 line 70
 * Practice 06 line 159
 *
 * */

public class HomeWork2 {
    public static void main(String[] args) {


        double expoNum = 1; //Use for Practice00 & Practice01
        int[] myIntArr = new int[6]; // Use for Practice 02
        int sumArr = 0; // Use for Practice 02
        int avgArr; // Use for Practice 02

        //Initial Scanner
        Scanner scanner = new Scanner(System.in);

        //Ask User to input initial Value for practice 00 & practice 01 & Practice 06
        System.out.print("Input number: ");
        int inputNumber = scanner.nextInt();

        //Check Whether User want to manually input Array Data by them self or choose a Default Setup Array
        System.out.print("Do you want to:\n 1. Choose a Default Array (D)\n 2. Input a normal Array (N)\n 3. Input a Prime Number Array (P)\nYour Selection is: ");

        // Start the loop of User Selection
        for (int police = 0; police < 2; police++) {
            String userDecision = scanner.next();
            switch (userDecision) {
                // Run when User choose Default Array
                case "D":
                    // Ask User to manually input Array Value
                    for (int index = 0; index < myIntArr.length; index++) {
                        myIntArr[index] = index + 1;
                    }
                    // Check if the value is correct
                    System.out.printf("Your Array is: %s\n", Arrays.toString(myIntArr));
                    // Break the loop
                    police = 1;
                    break;

                // Run when User choose Manually input Normal Array
                case "N":
                    //Ask User to manually input Array Value
                    for (int index = 0; index < myIntArr.length; index++) {
                        System.out.printf("Input number for Array Index[%d]: ", index);
                        myIntArr[index] = scanner.nextInt();
                    }

                    // Check if the value is correct
                    System.out.printf("Your Array is: %s\n", Arrays.toString(myIntArr));
                    // Break the loop
                    police = 1;
                    break;

                // Run when User choose to input Prime Array
                case "P":
                    myIntArr[0] = 1; // Initial Array value as 1 to avoid breaking the loop when user input the wrong value from the begins
                    System.out.println("Your 1st Array value is default set as [1]\n"); // Inform User in advanced

                    /*====== Practice 05 Check If A Number is a prime number ======*/
                    //Ask User to manually input prime Array Value
                    for (int index = 1; index < myIntArr.length; index++) {
                        System.out.printf("Input Prime number for Array Index[%d]: ", index);
                        myIntArr[index] = scanner.nextInt();

                        // Start checking if the input number is a Prime number
                        // Verify if user input 1,2,3 then automatically recognize it as Prime number
                        if (myIntArr[index] <= 3 && myIntArr[index] > 0) {
                        } else if (myIntArr[index] % 2 != 0) { // Check if the input number can divide to two, if it is possible then it's not a prime number

                            int y = myIntArr[index] / 2; // Divide the index to 2 to get half the input value
                            // Divide to every number from half input value until 2 to check if there are any value dividable
                            for (int x = y; x > 1; x--) {
                                if (myIntArr[index] % x == 0) {
                                    System.out.printf("%d is dividable to %d\n", myIntArr[index], x);
                                    System.out.printf("%d is not a prime number\n", myIntArr[index]);
                                    // Break the loop
                                    x = 2;
                                    // Repeat the input array
                                    index--;
                                }
                            }
                        } else { // In this case the Input number can divide to two, so it's not a prime number
                            System.out.printf("%d is not a prime number\n", myIntArr[index]);
                            // Repeat the input array
                            index--;
                        }
                    }
                    // Check if the value is correct
                    System.out.printf("Your Array is: %s\n", Arrays.toString(myIntArr));
                    // Break the loop
                    police = 1;
                    break;
                default:
                    System.out.println("Please choose a correct selection");
                    // Repeat the loop
                    police = 0;
                    break;
            }
        }

        /*====== Practice 00 ======*/
        System.out.println("===============================");
        System.out.println("Practice 00 Result: ");

        for (int currentNumber = inputNumber; currentNumber > 0; currentNumber--) {
            for (int index = inputNumber; index >= currentNumber; index--) {
                System.out.print("*");
            }
            System.out.println();
        }

        /*====== Practice 01 - Tinh giai thua ======*/
        System.out.println("===============================");
        System.out.println("Practice 01 Result: ");

        for (int i = 1; i <= inputNumber; i++) {
            expoNum = expoNum * i;
        }
        System.out.printf("Luy thua cua %d la %s\n", inputNumber, expoNum);

        //Practice 02 - Tinh trung binh cong cua 1 mang cac so nguyen
        System.out.println("===============================");
        System.out.println("Practice 02 Result: ");

        for (int i : myIntArr) {
            sumArr += i;
        }
        avgArr = sumArr / myIntArr.length;
        System.out.printf("Average of myIntArr is: %d\n", avgArr);

        /*====== Practice 03 - Tim so lon nhat cua 1 mang cac so nguyen ======*/
        /*====== Practice 04 - sap xep gia tri mang cac so nguyen tu nho den lon ======*/
        System.out.println("===============================");
        System.out.println("Practice 03 & 04 Result: ");
        for (int index2 : myIntArr) {
            for (int index = 1; index < myIntArr.length; index++) {
                int x = index - 1;
                int A = myIntArr[x];
                if (myIntArr[index] < myIntArr[x]) {
                    myIntArr[x] = myIntArr[index];
                    myIntArr[index] = A;
                }
            }
        }
        System.out.printf("[03] The Biggest number in the Array is: %d\n", myIntArr[5]);
        System.out.printf("[04] Your ASC shorted Array is: %s\n", Arrays.toString(myIntArr));

        /*====== Practice 06 - Input a number and print all the prime numbers under that number ======*/
        System.out.println("===============================");
        System.out.println("Practice 06 Result: ");

        // Start checking if the input number is a Prime number
        // Verify if user input 1,2,3 then automatically send out the prefix result
        // I Get the idea for this practice from this link https://beginnersbook.com/2014/01/java-program-to-display-prime-numbers/
        int check = 0;
        int num = 0;
        String primeNumbers = ""; //Initial an empty String

        for (check = 1; check <= inputNumber; check++) {
            int counter = 0;
            for (num = check; num >= 1; num--) {
                if (check % num == 0) {
                    counter = counter + 1;
                }
            }
            if (counter == 2) {
                //Add the Prime number to the String
                primeNumbers = primeNumbers + check + " ";
            }
        }
        System.out.printf("Prime numbers from 1 to %d are :", inputNumber);
        System.out.println(primeNumbers);
    }
}

