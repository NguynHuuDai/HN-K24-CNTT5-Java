public class bt3 {

    public static void main(String[] args) {

        Product p = new Product("SP01", "Laptop", 15000000);

        System.out.println("ban dau:");
        p.display();

        System.out.println("set gia = -5000");
        p.setPrice(-5000);

        System.out.println("sau khi set gia sai:");
        p.display();

        System.out.println("Set gia hop le = 18000000");
        p.setPrice(18000000);

        System.out.println("cuoi:");
        p.display();
    }

}
