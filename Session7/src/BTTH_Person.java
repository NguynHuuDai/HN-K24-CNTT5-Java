public class BTTH_Person {
    private String id;
    private String name;

    static int studentCount = 0;
    static final String SCHOOL_NAME = "PTIT";

    public BTTH_Person(String id, String name) {
        this.id = id;
        this.name = name;
        studentCount++;
    }

    public void displayInfo() {
        System.out.println("ID: " + id + ", Name: " + name + ", School: " + SCHOOL_NAME);
    }

    public static void showTotalStudent() {
        System.out.println("Total students: " + studentCount);
    }
}