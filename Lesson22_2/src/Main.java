public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Steve", 2.6, "black");
        Dog dog1 = new Dog("Barry", 6, "white");
        Hamster hamster1 = new Hamster("Harry", 1.2, "brown");

        hamster1.barry();
        System.out.println(dog1.brb());
        System.out.println(cat1.usu());
    }
}