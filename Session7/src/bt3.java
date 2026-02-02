public class bt3 {
    public static void main(String[] args) {

        double[] scores = {6.5, 8.0, 4.5};

        System.out.println("Danh sách điểm: 6.5, 8.0, 4.5");
        System.out.println("\n>> Kết quả xử lý:");

        double avg = ScoreUtils.calculateAverage(scores);
        System.out.println("- Điểm trung bình cả lớp: " + String.format("%.2f", avg));

        for (int i = 0; i < scores.length; i++) {
            if (ScoreUtils.checkPass(scores[i])) {
                System.out.println("- Điểm " + scores[i] + ": Đạt");
            } else {
                System.out.println("- Điểm " + scores[i] + ": Trượt");
            }
        }
    }
}
