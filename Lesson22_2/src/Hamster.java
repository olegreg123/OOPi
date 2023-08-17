public class Hamster extends Home {
    public Hamster(String name, double age, String color) {
        super(name, age, color);
    }

    public void barry() {
        System.out.println("His name is " + getName() + "." + "He is " + getAge() + " years old " + " and he is " + getColor());
    }
}
