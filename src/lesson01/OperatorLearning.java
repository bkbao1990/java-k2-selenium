package lesson01;

public class OperatorLearning {
    public static void main(String[] args) {
        int intNum1 = 1;
        int intNum2 = 2;

        int result = ++intNum1 + intNum2++; // breakpoint

        // pre fix intNum1 = 2
        // right side: 4
        // Assignment: Result <--4
        // Post fix: intNum2: 3
        System.out.println(intNum1);
        System.out.println(intNum2);

        int multiple = intNum1 * intNum2;
        int division = intNum2/intNum1; // chia lay nguyen
        int division_ = intNum2 % intNum1; // chia lay du
    }
}
