package lesson.Lesson07;

public class CEO extends Employee {
    @Override
    protected double getSalary() {
        return 5;
    }

    @Override
    protected double getSupportMoney() {
        return 1;
    }
}
