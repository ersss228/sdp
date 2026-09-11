public class Car {
    private String engine;
    private int seats;
    private boolean gps;
    private String color;

    public Car(String engine, int seats, boolean gps, String color) {
        this.engine = engine;
        this.seats = seats;
        this.gps = gps;
        this.color = color;
    }
    @Override
    public String toString() {
        return "Car{" +
                "engine='" + engine + '\'' +
                ", seats=" + seats +
                ", gps=" + gps +
                ", color='" + color + '\'' +
                '}';
    }
}
