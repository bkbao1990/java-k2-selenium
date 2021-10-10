package Lesson04;

public class TestRobotCat {
    public static void main(String[] args) {
        RobotCat robotCat = new RobotCat();
        RobotCat meoMeo = new RobotCat("MeoMeo");
        System.out.printf("%s\n",meoMeo.getName());

        meoMeo.setName("123abc");
        System.out.println(meoMeo.getName());

        robotCat.setName("MeoMeo");
        System.out.println(robotCat.getName());

    }
}
