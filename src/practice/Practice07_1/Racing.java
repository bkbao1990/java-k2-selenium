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

    }

    public void racingResult(List<Animals> animals) {
        int totalRacingDistance = 1000;
        int currentDistance = 0;
        int counter = 0;
        List<Animals> allowToRace = new ArrayList<>();
        for (Animals animal : animals) {
            if (!animal.getFlyable()) {
                allowToRace.add(animal);
            }
        }
       // do {
            for (Animals index : allowToRace) {
                index.raceDistance(currentDistance+= index.getSpeed());
                counter++;
            }
       // }
      //  while ((List<Animals> allowToRace.stream(tiger) <= totalRaceLength) && (horseCurrentDistance <= totalRaceLength) && (tigerCurrentDistance <= totalRaceLength));
//
//    int dogSpeed = dogCurrentDistance / counter;
//    int tigerSpeed = tigerCurrentDistance / counter;
//    int horseSpeed = horseCurrentDistance / counter;
//
//        System.out.println(animals);
//        if((tigerCurrentDistance >dogCurrentDistance)&&(tigerCurrentDistance >horseCurrentDistance))
//            System.out.printf("Winner is %s, with total run distance is: %d and average speed: %d.",tiger.getRace(),tigerCurrentDistance,tigerSpeed);
//        else if((horseCurrentDistance >tigerCurrentDistance)&&(horseCurrentDistance >dogCurrentDistance))
//            System.out.printf("Winner is %s, with total run distance is: %d and average speed: %d.",horse.getRace(),horseCurrentDistance,horseSpeed);
//        else
//                System.out.printf("Winner is %s, with total run distance is: %d and average speed: %d.",dog.getRace(),horseCurrentDistance,dogSpeed);
//    }
//
//
//        }

    }
}
