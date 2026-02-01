public class bt6 {
    public static void main(String[] args) {

        System.out.println("User hop le:");
        User u1 = new User(
                "U01",
                "admin",
                "123456",
                "admin@gmail.com"
        );
        u1.display();

        System.out.println("User sai email:");
        User u2 = new User(
                "U02",
                "user02",
                "abcdef",
                "user02gmail.com"
        );
        u2.display();

        System.out.println("Thu set password rong:");
        u1.setPassword("");
        u1.display();

        System.out.println("Thu set email sai:");
        u1.setEmail("abc@abc");
        u1.display();
    }

}
