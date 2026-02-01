public class Btth {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("001", "Nguyen Huu Dai", 5000);

        BankAccount acc2 = new BankAccount("002", "Nguyen Minh Vuong", 3000);

        acc1.display();
        acc2.display();

        acc1.deposit(2000);
        acc1.withdraw(1000);

        acc2.deposit(1000);
        acc2.withdraw(5000);

        acc1.display();
        acc2.display();
    }
}
