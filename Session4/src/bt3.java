import java.util.Scanner;

public class bt3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng giao dịch: ");
        int n = sc.nextInt();

        String[] transactions = new String[n];
        for (int i = 0; i < n; i++) {
            transactions[i] = "BK" + (100 + i) + "-20/01";
        }

        long start1 = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append("Giao dịch: ").append(transactions[i]).append("\n");
        }
        long end1 = System.nanoTime();
        long timeSB = end1 - start1;

        long start2 = System.nanoTime();
        String result = "";
        for (int i = 0; i < n; i++) {
            result = result + "Giao dịch: " + transactions[i] + "\n";
        }
        long end2 = System.nanoTime();
        long timeString = end2 - start2;

        System.out.println("\n--- KẾT QUẢ SO SÁNH HIỆU NĂNG ---");
        System.out.println("Thời gian StringBuilder: " + timeSB + " ns");
        System.out.println("Thời gian String (+):     " + timeString + " ns");

        if (timeString > timeSB) {
            System.out.println("=> StringBuilder nhanh hơn khi nối chuỗi liên tục!");
        } else {
            System.out.println("=> Dữ liệu nhỏ nên chưa thấy khác biệt rõ rệt.");
        }
    }
}
