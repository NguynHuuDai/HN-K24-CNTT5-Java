import java.util.Scanner;

public class bt2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập mô tả sách: ");
        String description = sc.nextLine();

        if (description.contains("Kệ:")) {

            int start = description.indexOf("Kệ:") + 3;

            if (start < description.length() && description.charAt(start) == ' ') {
                start++;
            }

            int comma = description.indexOf(",", start);

            String position;

            if (comma == -1) {
                position = description.substring(start).trim();
            } else {
                position = description.substring(start, comma).trim();
            }

            System.out.println("Vị trí tìm thấy: " + position);

            String newDescription = description.replace("Kệ:", "Vị trí lưu trữ:");

            System.out.println("Mô tả mới: " + newDescription + ".");
        } else {
            System.out.println("Không tìm thấy vị trí kệ trong mô tả!");
        }
    }
}
