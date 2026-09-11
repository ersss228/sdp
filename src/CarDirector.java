public class CarDirector {

    public Car buildSportsCar(SportsCarBuilder builder) {
        return builder
                .configureDefault()
                .build();
    }

    public Car buildFamilyCar(FamilyCarBuilder builder) {
        return builder
                .configureDefault()
                .build();
    }
}