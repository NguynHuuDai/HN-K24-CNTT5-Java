import java.util.Scanner;

public class btth {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // ======== Nhập dữ liệu ========
        System.out.print("Nhập vào mã sách (LIB-xxxx-S): ");
        String bookId = sc.nextLine();

        System.out.print("Nhập vào mã ISBN (10 chữ số): ");
        String isbn = sc.nextLine();

        System.out.print("Nhập vào năm xuất bản: ");
        String yearStr = sc.nextLine();

        System.out.print("Nhập vào tên sách: ");
        String title = sc.nextLine();

        System.out.print("Nhập vào tên tác giả: ");
        String author = sc.nextLine();

        boolean valid = true;

        if (!bookId.matches("^LIB-\\d{4}-S$")) {
            System.out.println("Sai định dạng Book ID! (định dạng: LIB-xxxx-S)");
            valid = false;
        }

        if (!isbn.matches("^\\d{10}$")) {
            System.out.println("ISBN không hợp lệ! (phải đúng 10 số)");
            valid = false;
        }

        int year = 0;
        if (yearStr.matches("^\\d{4}$")) {
            year = Integer.parseInt(yearStr);
            if (year > 2026) {
                System.out.println("Năm xuất bản không được > 2026");
                valid = false;
            }
        } else {
            System.out.println("Năm xuất bản phải gồm đúng 4 chữ số");
            valid = false;
        }

        if (!valid) {
            return;
        }

        title = normalize(title);
        author = normalize(author);

        StringBuilder sb = new StringBuilder();
        sb.append(bookId).append(" - ")
                .append(title).append(" - ")
                .append(author).append(" (")
                .append(year).append(")");

        System.out.println("\nThông tin chuẩn hoá: ");
        System.out.println(sb.toString());
    }

    private static String normalize(String input){
        input = input.trim().toLowerCase();
        String[] words = input.split("\\s+");

        StringBuilder sb = new StringBuilder();
        for (String w : words) {
            sb.append(Character.toUpperCase(w.charAt(0)))
                    .append(w.substring(1))
                    .append(" ");
        }
        return sb.toString().trim();
    }
}
