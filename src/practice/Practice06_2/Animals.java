package practice.Practice06_2;

public class Animals {
    private final String race;
    private final int maxSpeed;
    private final int racingDistance;
    private final boolean flyable;

    private Animals(Builder builder){
        race = builder.race;
        maxSpeed = builder.maxSpeed;
        racingDistance = builder.racingDistance;
        flyable = builder.flyable;
    }

    public static class Builder {
        private String race;
        private int maxSpeed;
        private int racingDistance;
        private boolean flyable;

        public Builder whatTypeOfAnimal (String race){
            this.race = race;
            return this;
        }

        public Builder whatIsTheMaximumSpeed (int maxSpeed){
            this.maxSpeed = maxSpeed;
            return this;
        }

        public Builder whatIsTheFinalRacingDistance (int racingDistance) {
            this.racingDistance = racingDistance;
            return this;
        }

        public Builder canItFly (boolean flyable){
            this.flyable = flyable;
            return this;
        }


        public Animals build() {
            return new Animals(this);
        }
    }
}
