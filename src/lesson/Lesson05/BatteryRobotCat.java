package lesson.Lesson05;
// Child Class | Concrete Class |  Sub_Class
public class BatteryRobotCat extends RobotCat {

    private String batteryType;

    public BatteryRobotCat() {
    }

    public BatteryRobotCat(String name, String productionDate) {
        super(name, productionDate);
    }

    public BatteryRobotCat(String name, String productionDate, String batteryType) {
        super(name, productionDate);
        this.batteryType = batteryType;
    }

    public String getBatteryType() {
        return batteryType;
    }

    public void setBatteryType(String batteryType) {
        this.batteryType = batteryType;
    }

    // . dot notaion

    // Annotation

    // Context: Inheritance
    // Statistics
    // Compiling time, run time
    @Override
    public void charge() {
        System.out.println("Battery charging...");
    }
}
