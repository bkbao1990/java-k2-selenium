package lesson.Lesson07;

public class Manager extends Employee {
    @Override
    protected double getSalary() {
        return 3;
    }

    @Override
    protected double getSupportMoney() {
        return 3;
    }
}
