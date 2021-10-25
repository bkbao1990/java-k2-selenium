package practice.Practice06_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Racing {
    public static void main(String[] args) {
        int totalRaceLength = 1000;

        List<Animals> animals = new ArrayList<>();
        Animals dog = new Dog();
        Animals tiger = new Tiger();
        Animals horse = new Horse();

        animals.add(dog);
        animals.add(tiger);
        animals.add(horse);

        for (int index = 0; index<animals.size(); index++) {
            Animals animal = animals.get(index);
            System.out.println("animal: " + animal.getClass().getSimpleName() + " speed " + animal.getSpeed());
        }

        Animals winner = null;
        if(animals.isEmpty())
            System.out.println("there is no animals");

        for (Animals animal : animals) {
            if (winner == null){
                winner = animal;
            } else {
                if (animal.getSpeed() > winner.getSpeed())
                    winner = animal;
            }
        }

        System.out.println("winner " + winner.getClass().getSimpleName() + " speed " + winner.getSpeed());

//        int dogCurrentDistance = 0;
//        int horseCurrentDistance = 0;
//        int tigerCurrentDistance = 0;
//        int counter = 0;
//
//
//        do {
//            for (Animals animal : animals) {
//                dog.setRaceDistance(dogCurrentDistance += dog.getSpeed());
//                horse.setRaceDistance(horseCurrentDistance += horse.getSpeed());
//                tiger.setRaceDistance(tigerCurrentDistance += tiger.getSpeed());
//                counter++;
//            }
//        }
//        while ((dogCurrentDistance <= totalRaceLength) && (horseCurrentDistance <= totalRaceLength) && (tigerCurrentDistance <= totalRaceLength));
//
//        int dogSpeed = dogCurrentDistance / counter;
//        int tigerSpeed = tigerCurrentDistance / counter;
//        int horseSpeed = horseCurrentDistance / counter;
//
//        System.out.println(animals);
//        if ((tigerCurrentDistance > dogCurrentDistance) && (tigerCurrentDistance > horseCurrentDistance))
//            System.out.printf("Winner is %s, with total run distance is: %d and average speed: %d.", tiger.getRace(), tigerCurrentDistance,tigerSpeed);
//        else if ((horseCurrentDistance > tigerCurrentDistance) && (horseCurrentDistance > dogCurrentDistance))
//            System.out.printf("Winner is %s, with total run distance is: %d and average speed: %d.", horse.getRace(),horseCurrentDistance, horseSpeed);
//        else
//            System.out.printf("Winner is %s, with total run distance is: %d and average speed: %d.", dog.getRace(), dogCurrentDistance, dogSpeed);
    }
}
