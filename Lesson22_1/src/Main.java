public class Main {
    public static void main(String[] args) {

        Major clothing = new Clothing("Blazer", 25);
        Clothing clothing1 = new Clothing("Shirt", 15);

        Major products = new Products("Apples", 2);
        Products products1 = new Products("Bread", 1);

        Major electronics = new Electronics("TV", 800);
        Electronics electronics1 = new Electronics("Phone", 400);


        System.out.println("-----------------------------");


        products.buy();
        clothing1.buy();
    }
}