public class bt1 {
    public static void main(String[] args) {
        Student s1 = new Student("SV01", "Nguyen Van A");
        Student s2 = new Student("SV02", "Nguyen Van B");
        Student s3 = new Student("SV03", "Nguyen Van C");

        s1.displayInfo();
        s2.displayInfo();
        s3.displayInfo();

        Student.showTotalStudent();
        }
}
