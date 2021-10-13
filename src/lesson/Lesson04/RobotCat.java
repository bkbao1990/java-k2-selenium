package lesson.Lesson04;

public class RobotCat {

    private String name;

    public RobotCat() {

    }

    public RobotCat(String name) {
        this.name = name;
    }

    //Getters
    public String getName() {
        return this.name;
    }

    //Setters
    public void setName(String name) {
        this.name = name;
    }

    public void run() {
        System.out.println("running");
    }

}
