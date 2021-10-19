package lesson.Lesson06;

import lesson.Lesson06.House.Builder;

public class TestHouse {
    public static void main(String[] args) {
       // House.Builder builder = new House.Builder();
        Builder builder = new Builder();
        House house = builder.whatColor("Black").howManyDoor(10).build();

        System.out.println(house);


    }
}
