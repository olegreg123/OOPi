public class Cat extends Home {
    public Cat(String name, double age, String color) {
        super(name, age, color);
    }

    public String usu() {
        return "His name is " + getName() + "." + "He is " + getAge() + " years old " + " and he is " + getColor();
    }
}