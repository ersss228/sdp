public abstract class BaseCarBuilder implements CarBuilder {
  protected String engine;
  protected int seats;
  protected boolean gps;
  protected String color;

  @Override
  public CarBuilder setEngine(String engine) {
    this.engine = engine;
    return this;
  }

  @Override
  public CarBuilder setSeats(int seats) {
    this.seats = seats;
    return this;
  }

  @Override
  public CarBuilder setGPS(boolean gps) {
    this.gps = gps;
    return this;
  }

  @Override
  public CarBuilder setColor(String color) {
    this.color = color;
    return this;
  }



  protected void validate(){
      if (seats <= 0){
          throw new IllegalStateException("Seats must be greater than 0");
      }
      if (engine == null || engine.isBlank()) {
          throw new IllegalStateException("Engine cannot be empty");
      }
  }

  @Override
    public Car build() {
      validate();
      return new Car(engine,seats,gps,color);
  }
}
