public class Products extends Major {
    public Products(String name, int price) {
        super(name, price);
    }


    public void buy() {
        System.out.println("Thank you for your purchase! You will have to pay extra 0,25¢ cent in case of urgent delivery");
    }
}