package practice.Practice06_2;

public class Animals {
    private final int speed;
    private final boolean flyable;
    private final String raceName;


    private Animals(Builder builder) {
        speed = builder.speed;
        flyable = builder.flyable;
        raceName = builder.raceName;
    }

    //Method
    public boolean isFlyable() {
        return flyable;
    }

    public int getSpeed() {
        return this.speed;
    }

    public String getRaceName(){
        return this.raceName;
    }

    //Inner Class
    public static class Builder {
        private int speed;
        private boolean flyable;
        private String raceName;

        public Builder speed(int speed) {
            this.speed = speed;
            return this;
        }

        public Builder flyable(boolean flyable) {
            this.flyable = flyable;
            return this;
        }

        public Builder raceName(String raceName){
            this.raceName = raceName;
            return this;
        }
        public Animals build() {
            return new Animals(this);
        }
    }
}


