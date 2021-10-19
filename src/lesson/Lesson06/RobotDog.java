package lesson.Lesson06;

public class RobotDog {

    private String name;
    private int id;
    protected static int counter;
    protected static String defaultNam="123";


    public RobotDog(){

    }

    public RobotDog(String name) {
        this.name = name;
        counter++;
        this.id = counter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    protected static void doSth(){
        System.out.println("asd");
        counter++;
    }
    protected String getDefaultNam(){
        return defaultNam;
    }

    private void doAnotherThing(){
        counter++;
    }

}
