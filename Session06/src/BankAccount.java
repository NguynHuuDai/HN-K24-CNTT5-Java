public class BankAccount {
        // Thuoc tinh private
        private String accountNumber;
        private String ownerName;
        private double balance;

        // Constructor khong tham so
        public BankAccount() {
            this.accountNumber = "Chua co";
            this.ownerName = "Chua co";
            this.balance = 0;
        }

        // Constructor co tham so
        public BankAccount(String accountNumber, String ownerName, double balance) {
            this.accountNumber = accountNumber;
            this.ownerName = ownerName;

            // Kiem tra so du hop le
            if (balance >= 0) {
                this.balance = balance;
            } else {
                this.balance = 0;
            }
        }

        // Getter
        public String getAccountNumber() {
            return accountNumber;
        }

        public String getOwnerName() {
            return ownerName;
        }

        public double getBalance() {
            return balance;
        }

        // Setter (kiem tra du lieu)
        public void setAccountNumber(String accountNumber) {
            this.accountNumber = accountNumber;
        }

        public void setOwnerName(String ownerName) {
            this.ownerName = ownerName;
        }

        public void setBalance(double balance) {
            if (balance >= 0) {
                this.balance = balance;
            } else {
                System.err.println("So du khong hop le!");
            }
        }

        // Nap tien
        public void deposit(double amount) {
            if (amount > 0) {
                balance += amount;
            } else {
                System.err.println("So tien nap phai > 0");
            }
        }

        // Rut tien
        public void withdraw(double amount) {
            if (amount > 0 && amount <= balance) {
                balance -= amount;
            } else {
                System.err.println("Rut tien that bai!");
            }
        }

        // Hien thi thong tin
        public void display() {
            System.out.println("So tai khoan: " + accountNumber);
            System.out.println("Chu tai khoan: " + ownerName);
            System.out.println("So du: " + balance);
            System.out.println("----------------------");
        }

}
