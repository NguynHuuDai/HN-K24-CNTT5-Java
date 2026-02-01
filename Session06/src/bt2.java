public class bt2 {

    public static void main(String[] args) {

        Account acc = new Account(
                "user27",
                "270806",
                "daizzt10@gmail.com"
        );

        System.out.println("Thong tin ban dau:");
        acc.display();

        acc.changePassword("3636363");

        System.out.println("Sau khi doi mat khau:");
        acc.display();
    }

}
