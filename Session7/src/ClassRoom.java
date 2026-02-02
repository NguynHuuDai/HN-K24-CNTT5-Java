public class ClassRoom {
    static double classFund = 0;

    private String studentName;

    public ClassRoom(String studentName) {
        this.studentName = studentName;
    }

    public void contribute(double amount) {
        classFund += amount;
        System.out.println(studentName + " dong " + amount);
    }

    public static void showClassFund() {
        System.out.println("Tong quy lop: " + classFund);
    }
}