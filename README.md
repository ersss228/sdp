# Builder Pattern - Car

This project demonstrates the Builder design pattern in Java.

The product of this project is a Car. The program can create different car configurations, such as a sports car and a family car.

## Project Structure

- `Car` - the product that is being built.
- `CarBuilder` - the Builder interface that defines the construction steps.
- `BaseCarBuilder` - contains common building logic and validation.
- `SportsCarBuilder` - creates the sports car configuration.
- `FamilyCarBuilder` - creates the family car configuration.
- `CarDirector` - controls the construction process.
- `Main` - demonstrates how the Builder pattern works.

## How to Run

1.  Open `Main.java`.
2. Run the `main()` method.

## Example Output

Car{engine='V8', seats=2, gps=true, color='red'}
Car{engine='V6', seats=8, gps=false, color='black'}