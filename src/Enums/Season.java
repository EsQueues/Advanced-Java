package Enums;

public enum Season {
    WINTER(-25),SPRING(0),SUMMER(27),AUTUMN(-1);

    public int getTemperature() {
        return temperature;
    }

    private int temperature;

    Season(int temperature){
        this.temperature=temperature;
    }

    Season() {

    }
}
