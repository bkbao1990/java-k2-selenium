package lesson.Lesson06;

public class BatteryRobotDog extends RobotDog{

    static {
        defaultNam = "abcxyz";
    }
    public BatteryRobotDog(String name) {
        super(name);
    }

    public void hackRobotId(){
        counter++;
    }
    // NOT overriding
    protected static void doSth(){
        System.out.println("asd");
    }


}
