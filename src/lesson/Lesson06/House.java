package lesson.Lesson06;

public class House {
    private final String color;
    private final int mainDoors;
    private final String topRoof;

    private House(Builder builder) {
        color = builder.color;
        mainDoors = builder.mainDoors;
        topRoof = builder.topRoof;
    }

    //Builder Design Pattern || Inner Class
    public static class Builder {
        private String color;
        private int mainDoors;
        private String topRoof;

        //Dot notation
        public Builder whatColor(String color) {
            this.color = color;
            return this;
        }

        public Builder howManyDoor(int mainDoors) {
            this.mainDoors = mainDoors;
            return this;
        }

        public Builder whatTopRoofType(String topRoof) {
            this.topRoof = topRoof;
            return this;
        }

        public House build() {
            return new House(this);
        }
    }

    @Override
    public String toString() {
        return "House{" +
                "color='" + color + '\'' +
                ", mainDoors=" + mainDoors +
                ", topRoof='" + topRoof + '\'' +
                '}';
    }
}





    // Read-only
//    public String getColor(){
//        return this.color;
//    }

//    // Write-Only
//    public void setColor(String newColor){
//        this.color = color;
//    }
