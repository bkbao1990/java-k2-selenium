package lesson.Lesson07;

public class StandardEmployee extends Employee {
    @Override
    protected double getSalary() {
        return 2;
    }

    @Override
    protected double getSupportMoney() {
        return 3;
    }
}
