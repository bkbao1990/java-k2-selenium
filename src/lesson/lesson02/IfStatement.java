package lesson.lesson02;

public class IfStatement {
    public static void main(String[] args) {
        System.out.println("1. Dat xe ra");
        System.out.println("2. Khoi dong xe");
        System.out.println("3. Chay toi quan");

        boolean isHeOnTime = false;

        if (isHeOnTime) {
            System.out.println("Let's talk!");

        } else {
            System.out.println("Write a letter");
        }
        System.out.println("1. Dat xe ra");
        System.out.println("2. Khoi dong xe");
        System.out.println("3. Chay ve nha");

        boolean isItTrue = 1 < 2 ? true : false;
        // 1<2 neu dung isItTrue = true : (con khong) isItTrue = false
    }
}
