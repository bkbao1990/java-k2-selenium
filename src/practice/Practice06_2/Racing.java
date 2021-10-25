package practice.Practice06_2;

import practice.Practice06_2.Animals.Builder;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Racing {
    private final static int TIGER_MAX_SPEED = 100;
    private final static int HORSE_MAX_SPEED = 200;
    private final static int DOG_MAX_SPEED = 80;
    private final static int FALCON_MAX_SPEED = 180;

    public static void main(String[] args) {
        //Builder builder = new Builder();
        Animals tiger = new Animals.Builder().
                flyable(false).
                speed(new SecureRandom().nextInt(TIGER_MAX_SPEED)).
                raceName("Tiger").
                build();
        Animals horse = new Animals.Builder().
                flyable(false).
                speed(new SecureRandom().nextInt(HORSE_MAX_SPEED)).
                raceName("Horse").
                build();
        Animals dog = new Animals.Builder().
                flyable(false).
                speed(new SecureRandom().nextInt(DOG_MAX_SPEED)).
                raceName("Dog").
                build();
        Animals falcon = new Animals.Builder().
                flyable(true).
                speed(new SecureRandom().nextInt(FALCON_MAX_SPEED)).
                raceName("Falcon").
                build();

        List<Animals> animals = Arrays.asList(tiger, horse, dog, falcon);

        List<Animals> applicableAnimals = new ArrayList<>();

        for (Animals animal : animals) {
            if (!animal.isFlyable())
                applicableAnimals.add(animal);
        }

        for (int index = 0; index < animals.size(); index++) {
            Animals animal = animals.get(index);
            System.out.println("animal: " + animal.getRaceName() + " speed " + animal.getSpeed());
        }

        Animals winner = null;
        if (animals.isEmpty())
            System.out.println("there is no animals");

        for (Animals animal : applicableAnimals) {
            if (winner == null) {
                winner = animal;
            } else {
                if (animal.getSpeed() > winner.getSpeed())
                    winner = animal;
            }
        }
        System.out.println("winner " + winner.getRaceName() + " speed " + winner.getSpeed());
    }
}

