package practice.Practice06_2;

import practice.Practice06_2.Animals.Builder;

import java.util.ArrayList;
import java.util.List;

public class Racing {
    public static void main(String[] args) {
        int totalRaceLength = 1000;
        Builder builder = new Builder();

        Animals tiger =
                builder.whatTypeOfAnimal("Tiger").canItFly(false).whatIsTheMaximumSpeed(new SecureRandom.nextInt(TIGER_MAX_SPEDD))
        Animals animals1 = builder.whatTypeOfAnimal("Falcon").canItFly(true).whatIsTheMaximumSpeed(100).build();
        Animals animals2 = builder.whatTypeOfAnimal("Snake").canItFly(false).whatIsTheMaximumSpeed(50).build();
        Animals animals3 = builder.whatTypeOfAnimal("Puma").canItFly(false).whatIsTheMaximumSpeed(180).build();
        Animals animals4 = builder.whatTypeOfAnimal("Tiger").canItFly(false).whatIsTheMaximumSpeed(100).build();
        Animals animals5 = builder.whatTypeOfAnimal("Sparrow").canItFly(true).whatIsTheMaximumSpeed(120).build();

        List<Animals> animals = new ArrayList<>();
        animals.add(animals1);
        animals.add(animals2);
        animals.add(animals3);
        animals.add(animals4);
        animals.add(animals5);

        for (Animals animal : animals) {
            if(animal)
        }
        do {
            for (Animals ignored : animals) {
                dog.setRaceDistance(dogCurrentDistance += dog.getSpeed());
                horse.setRaceDistance(horseCurrentDistance += horse.getSpeed());
                tiger.setRaceDistance(tigerCurrentDistance += tiger.getSpeed());
                counter++;
            }
        }
        while ((dogCurrentDistance <= totalRaceLength) && (horseCurrentDistance <= totalRaceLength) && (tigerCurrentDistance <= totalRaceLength));

        int dogSpeed = dogCurrentDistance / counter;
        int tigerSpeed = tigerCurrentDistance / counter;
        int horseSpeed = horseCurrentDistance / counter;

        System.out.println(animals);
        if ((tigerCurrentDistance > dogCurrentDistance) && (tigerCurrentDistance > horseCurrentDistance))
            System.out.printf("Winner is %s, with total run distance is: %d and average speed: %d.", tiger.getRace(), tigerCurrentDistance, tigerSpeed);
        else if ((horseCurrentDistance > tigerCurrentDistance) && (horseCurrentDistance > dogCurrentDistance))
            System.out.printf("Winner is %s, with total run distance is: %d and average speed: %d.", horse.getRace(), horseCurrentDistance, horseSpeed);
        else
            System.out.printf("Winner is %s, with total run distance is: %d and average speed: %d.", dog.getRace(), horseCurrentDistance, dogSpeed);
    }
}
