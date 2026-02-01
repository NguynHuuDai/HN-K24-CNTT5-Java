public class Student {
    private String id;
    private String name;
    private int birthYear;
    private double gpa;

    public Student(String id, String name, int birthYear, double gpa) {
        this.id = id;
        this.name = name;
        this.birthYear = birthYear;
        this.gpa = gpa;
    }

    public void display() {
        System.out.println(id + " - " + name + " - " + birthYear + " - " + gpa);
    }
}