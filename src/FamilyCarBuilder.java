public class FamilyCarBuilder extends BaseCarBuilder {
    public FamilyCarBuilder configureDefault() {
        setEngine("V6");
        setSeats(8);
        setGPS(false);
        setColor("black");
        return this;
    }
}
