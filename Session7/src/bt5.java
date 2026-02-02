public class bt5 {
    public static void main(String[] args) {

        double score = 870;

        if (score >= Config.MIN_SCORE && score <= Config.MAX_SCORE) {
            System.out.println("Diem hop le: " + score);
        } else {
            System.err.println("Diem khong hop le");
        }

    }
}
