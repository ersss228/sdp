public class Main {
    public static void main(String[] args){
        CarDirector director = new CarDirector();
       Car sportsCar = director.buildSportsCar(new SportsCarBuilder());
       Car familyCar = director.buildFamilyCar(new FamilyCarBuilder());

       System.out.println(sportsCar);
       System.out.println(familyCar);
    }
}