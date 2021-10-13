package lesson.lesson03;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Exercise01 Line 15 Refactor the whole Exercise
 * Exercise02 Line 69
 * Exercise03 Line 88
 * Exercise04 Line 112 Remove the 2nd value in checkStr2
 */

public class Homework03 {
    public static void main(String[] args) {
        //======== Exercise 01 ========
        System.out.println("=====================================================");
        String myStr = "00hrs and 00minutes";
        String mySubStr1 = myStr.substring(0, myStr.indexOf(" a"));
        String mySubStr2 = myStr.substring(myStr.indexOf("d "));

        char[] allCharMyStr1 = mySubStr1.toCharArray();
        char[] allCharMyStr2 = mySubStr2.toCharArray();

        int[] tempHours = new int[2];
        int[] tempMinutes = new int[2];
        int minutes = 0;
        int hours = 0;
        int totalMinutes = 0;
        int h = 0;
        int m = 0;
        //Check the number and then add to temp Arr
        for (char scan1 : allCharMyStr1) {
            if (Character.isDigit(scan1))
                tempHours[h++] = Character.getNumericValue(scan1);
        }
        for (char scan2 : allCharMyStr2) {
            if (Character.isDigit(scan2))
                tempMinutes[m++] = Character.getNumericValue(scan2);
        }

        System.out.println(Arrays.toString(tempHours) + " " + Arrays.toString(tempMinutes));
        //Check if user using 0x,xx for hours
        if (mySubStr1.length() > 4) {
            if (tempHours[0] != 0 && tempHours[1] == 0) {
                hours = (tempHours[0] * 10) + tempHours[1];
            } else if (tempHours[0] != 0 && tempHours[1] != 0) {
                hours = (tempHours[0] * 10) + tempHours[1];
            } else if (tempHours[0] == 0 && tempHours[1] != 0) {
                hours = tempHours[1];
            }
        } else // Its mean User using x for hours
            hours = tempHours[0];

        //Check if user using 0x,xx for minutes
        if (mySubStr2.length() > 10) {
            if (tempMinutes[0] != 0 && tempMinutes[1] == 0) {
                minutes = (tempMinutes[0] * 10) + tempMinutes[1];
            } else if (tempMinutes[0] != 0 && tempMinutes[1] != 0) {
                minutes = (tempMinutes[0] * 10) + tempMinutes[1];
            } else if (tempMinutes[0] == 0 && tempMinutes[1] != 0) {
                minutes = tempMinutes[1];
            }
        } else // Its mean User using x for minutes
            minutes = tempMinutes[0];

        totalMinutes = (hours * 60) + minutes;
        System.out.printf("Total minutes is: %d\n", totalMinutes);

        //======== Exercise 02 ========
        System.out.println("=====================================================");
        String myPassword = "password123";
        Scanner scanner = new Scanner(System.in);
        int counter = 0; // User to count the number user input password
        final int Max_Counter = 3; // Set maximum times allow user to input wrong password
        do {
            System.out.println("Input your password: ");
            String password = scanner.next();
            if (password.equals(myPassword)) {
                System.out.println("This is a correct password!");
                break;
            } else if (counter < 2) {
                System.out.println("Your password is wrong, please try again!");
            }
            counter++;
        } while (counter < Max_Counter);
        System.out.println("Your account has been blocked, Please contact Admin to unlock!");

        //======== Exercise 03 ========
        System.out.println("=====================================================");
        String str1 = "12345n678";
        String str2 = "100 minutes";
        String tempArr = "";
        String tempArr2 = "";
        char[] myStrArr1 = str1.toCharArray();
        char[] myStrArr2 = str2.toCharArray();
        //Normal for
        for (int i = 0; i < myStrArr1.length; i++) {
            char character = myStrArr1[i];
            if (Character.isDigit(character)) {
                tempArr += myStrArr1[i];
            }
        }
        System.out.println(tempArr);

        // Enhance for
        for (char character2 : myStrArr2) {
            if (Character.isDigit(character2))
                tempArr2 += character2;
        }
        System.out.println(tempArr2);

        //======== Exercise 04 ==========
        System.out.println("=====================================================");
        String url = "http://google.com";
        String checkStr1 = url.substring(url.indexOf("h"), url.indexOf(":"));
        String checkStr2 = url.substring(url.indexOf("."));

        if (checkStr1.equals("http"))
            System.out.println("This is http\n");
        else if (checkStr1.equals("https"))
            System.out.println("This is https\n");
        else
            System.out.printf("This is neither http or https, this is: %s\n", checkStr1);

        if (checkStr2.equals(".com"))
            System.out.println("This is .com\n");
        else if (checkStr2.equals(".net"))
            System.out.println("This is .net\n");
        else
            System.out.printf("This is neither .com or .net, this is: %s\n", checkStr2);

    }
}
