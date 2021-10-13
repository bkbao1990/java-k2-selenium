package lesson.Lesson05;

public class Calculator {

    public int sum(int a, int b) {
        return a + b;
    }

    public int sum(int a, int b, int c) {
        return a + b + c;
    }

    // Varargs | Rest parameters
    public int sum(int... nums) {
        int total = 0;
        for (int num : nums) {
            total += num;
        }
        return total;
    }

    public int sum(String a, int... nums) {
        int total = 0;
        for (int num : nums) {
            total += num;
        }
        return total;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int sum = calculator.sum(1, 2);
        System.out.println(sum);

        System.out.println(calculator.sum("abc", 1, 1, 3, 4, 5, 6));
        System.out.println(calculator.sum(1, 1, 3, 4, 5, 6));
        System.out.println(calculator.sum(1, 1, 3, 4, 5, 6, 3, 4, 4));
    }
}
