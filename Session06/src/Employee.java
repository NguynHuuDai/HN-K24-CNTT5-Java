public class Employee {
    private String id;
    private String name;
    private double salary;

    public Employee() {
        this.id = "Chua co";
        this.name = "Chua co";
        this.salary = 0;
    }

    public Employee(String id, String name) {
        this.id = id;
        this.name = name;
        this.salary = 0;
    }

    public Employee(String id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void display() {
        System.out.println("Ma NV: " + id);
        System.out.println("Ten NV: " + name);
        System.out.println("Luong: " + salary);
        System.out.println("------------------");
    }
}