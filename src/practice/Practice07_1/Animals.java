package practice.Practice07_1;

public abstract class Animals {

    protected abstract boolean flyable();
    protected abstract String raceName();

    private int speed;

    public Animals (int speed){
        this.speed = speed;
    }

    public int getSpeed() {
        return this.speed;
    }

}
