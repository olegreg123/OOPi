package OOP;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Engine engine = new Engine ("diesel", "500");
        Car car = new Car ("Porsche", "black", "B-PM 57" );
        MyDate registrationDate = new MyDate("01.04.2022");

        System.out.println(engine);
        System.out.println(car);
        System.out.println(registrationDate);
        System.out.println(engine.start());
        System.out.println(engine.stop());
        System.out.println(car.drive());
        System.out.println(car.stop());



    }
}