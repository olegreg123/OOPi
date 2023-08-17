public class Dog extends Home {
    public Dog(String name, double age, String color) {
        super(name, age, color);
    }

    public String brb() {
        return "His name is " + getName() + "." + "He is " + getAge() + " years old " + " and he is " + getColor();
    }

}