package practice.Practice06_1;

import java.security.SecureRandom;

public class Animals {
    private int speed;
    private int raceDistance;
    private String race;

    public Animals(String race) {
        this.race = race;
    }

    public String getRace() {
        return race;
    }

    public int getSpeed() {
        return speed;
    }

    public int getRaceDistance() {
        return raceDistance;
    }

    public void setRaceDistance(int raceDistance) {
        this.raceDistance = raceDistance;
    }

    @Override
    public String toString() {
        return "Animals{" +
                "Total Run Distance=" + raceDistance +
                ", race='" + race + '\'' +
                '}';
    }
}
