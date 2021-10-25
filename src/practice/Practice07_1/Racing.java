package practice.Practice07_1;

import java.util.ArrayList;
import java.util.List;

public class Racing {
    public static void main(String[] args) {
        List<Animals> animals = new ArrayList<>();
        Tiger tiger = new Tiger();
        Puma puma = new Puma();
        Snake snake = new Snake();
        Falcon falcon = new Falcon();
        Sparrow sparrow = new Sparrow();

        animals.add(tiger);
        animals.add(puma);
        animals.add(snake);
        animals.add(falcon);
        animals.add(sparrow);

        List<Animals> applicableAnimals = new ArrayList<>();

        for (Animals animal : animals) {
            if (!animal.flyable())
                applicableAnimals.add(animal);
        }
        for (Animals applicableAnimal : applicableAnimals) {
            System.out.println(applicableAnimal.raceName());
        }

        for (int index = 0; index < animals.size(); index++) {
            Animals animal = animals.get(index);
            System.out.println("animal: " + animal.raceName() + " speed " + animal.speed());
        }

        Animals winner = null;
        if (animals.isEmpty())
            System.out.println("there is no animals");

        for (Animals animal : applicableAnimals) {
            if (winner == null) {
                winner = animal;
            } else {
                if (animal.speed() > winner.speed())
                    winner = animal;
            }
        }
        System.out.println("winner " + winner.raceName() + " speed " + winner.speed());
    }
}
