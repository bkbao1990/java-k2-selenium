package practice.Practice06_2;

public class Animals {
    private final int speed;
    private final boolean flyable;


    private Animals(Builder builder) {
        speed = builder.speed;
        flyable = builder.flyable;
    }

    //Method
    public boolean isFlyable() {
        return flyable;
    }

    public int getSpeed() {
        return this.speed;
    }

    //Inner Class
    public static class Builder {
        private int speed;
        private boolean flyable;

        public Builder speed(int speed) {
            this.speed = speed;
            return this;
        }

        public Builder flyable(boolean flyable) {
            this.flyable = flyable;
            return this;
        }
        public Animals build() {
            return new Animals(this);
        }
    }
}


