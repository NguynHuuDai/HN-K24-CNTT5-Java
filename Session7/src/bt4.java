public class bt4 {
    public static void main(String[] args) {

        ClassRoom s1 = new ClassRoom("Sinh vien A");
        ClassRoom s2 = new ClassRoom("Sinh vien B");
        ClassRoom s3 = new ClassRoom("Sinh vien C");

        s1.contribute(100);
        s2.contribute(200);
        s3.contribute(150);

        ClassRoom.showClassFund();
    }

}
