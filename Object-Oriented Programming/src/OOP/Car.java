package OOP;

public class Car {

    String brand;
    String color;
    String licensePlate;
    MyDate registrationDate;
    Engine engine;

    public Car (String brand, String color, String licensePlate) {
        this.brand = brand;
        this.color = color;
        this.licensePlate = licensePlate;
    }
        public String toString () {
            return "Brand is " + brand+". " + " Color is " + color+". " + "Licenseplate is: " + licensePlate;
        }
        public String drive () {
        return "The car rides";
        }
        public String stop () {
        return "The car is stopped";
        }

    }



