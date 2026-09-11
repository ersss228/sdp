public class SportsCarBuilder extends BaseCarBuilder{
    public SportsCarBuilder configureDefault() {
        setEngine("V8");
        setSeats(2);
        setGPS(true);
        setColor("red");
        return this;
    }
}
