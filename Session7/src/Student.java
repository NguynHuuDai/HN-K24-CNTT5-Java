public class Student {
    private String id;
    private String name;

    static int totalStudent = 0;

    public Student(String id, String name) {
        this.id = id;
        this.name = name;
        totalStudent++;
    }

    public void displayInfo() {
        System.out.println("ID: " + id + ", Name: " + name);
    }

    public static void showTotalStudent() {
        System.out.println("Total students: " + totalStudent);
    }
}