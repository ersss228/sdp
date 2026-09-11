public interface CarBuilder {
    CarBuilder setEngine(String engine);
    CarBuilder setSeats(int seats);
    CarBuilder setGPS(boolean gps);
    CarBuilder setColor(String color);
    Car build();
}
