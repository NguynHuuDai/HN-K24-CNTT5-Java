public class bt4 {

    public static void main(String[] args) {

        //  khong tham so
        Employee e1 = new Employee();

        // co ma va ten
        Employee e2 = new Employee("EX", "Nguyen Huu Dai");

        //  day du
        Employee e3 = new Employee("EU", "Vu Thanh Ha", 15000000);

        e1.display();
        e2.display();
        e3.display();
    }

}
