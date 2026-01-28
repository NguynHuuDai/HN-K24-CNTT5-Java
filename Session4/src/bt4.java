import java.util.Scanner;

public class bt4 {

        public static void main(String[] args) {
            String cardID = "TV202312345";
            validateCard(cardID);
        }

        public static void validateCard(String cardID) {
            String fullRegex = "^[A-Z]{2}[0-9]{4}[0-9]{5}$";
            if (cardID.matches(fullRegex)) {
                System.out.println("Mã thẻ hợp lệ!");
            } else {
                if (!cardID.matches("^[A-Z]{2}.*")) {
                    System.out.println("Lỗi: Mã thẻ phải bắt đầu bằng 2 chữ cái viết hoa (ví dụ: TV).");
                } else if (!cardID.matches("^[A-Z]{2}[0-9]{4}.*")) {
                    System.out.println("Lỗi: Năm vào học (4 chữ số) không hợp lệ.");
                } else if (cardID.length() != 11) {
                    System.out.println("Lỗi: Độ dài mã thẻ không đúng (phải có 11 ký tự).");
                } else {
                    System.out.println("Lỗi: 5 chữ số cuối không đúng định dạng.");
                }
            }
        }
    }