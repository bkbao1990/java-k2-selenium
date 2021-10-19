package lesson.Lesson06;

public class TestRobotDog {
    public static void main(String[] args) {
        RobotDog dog = new RobotDog();
        BatteryRobotDog batteryRobotDog = new BatteryRobotDog("abc");

        SolarRobotDog solarRobotDog = new SolarRobotDog("solar");
        System.out.println(batteryRobotDog.getDefaultNam());
        System.out.println(solarRobotDog.getDefaultNam());


    }
}
