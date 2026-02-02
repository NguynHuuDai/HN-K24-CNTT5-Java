public class bt2 {
    public static void main(String[] args) {
        int a = 10;
        int b = a;
        b = 20;

        System.out.println("Primitive:");
        System.out.println("a = " + a); // 10
        System.out.println("b = " + b); // 20

        // Reference type
        Student_Bt2 s1 = new Student_Bt2("An");
        Student_Bt2 s2 = s1;
        s2.name = "Binh";

        System.out.println("\nReference:");
        System.out.println("s1.name = " + s1.name);
        System.out.println("s2.name = " + s2.name);
    }
}
