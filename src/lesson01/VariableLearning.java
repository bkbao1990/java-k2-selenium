package lesson01;

public class VariableLearning {
    public static void main(String[] args) {
        int intNum = 18; // Declaration
        double doubleNum = 2.0;
        float floatNum = 3.0f;
        long longNum = 100L;
        boolean amIRight = false;

        intNum = 19; // Re-assign
        amIRight = true;

        System.out.println("My age: " + intNum);
        System.out.printf("My age is %d", intNum);
    }
}
