public class Clothing extends Major {
    public Clothing(String name, int price) {
        super(name, price);
    }


    @Override
    public void buy() {
        System.out.println("Thank you for your purchase! ");

    }
}

