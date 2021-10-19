package lesson.Lesson06.SmallPractice;

public class Manager extends Employee{
    @Override
    protected double getSalary() {
        return 3;
    }

    @Override
    protected double getSupportMoney() {
        return 3;
    }
}
