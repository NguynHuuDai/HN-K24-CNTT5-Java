import java.util.regex.*;
        import java.util.*;

public class bt5 {
    public static void main(String[] args) {
        List<String> logs = Arrays.asList(
                "2024-05-20 | User: NguyenVanA | Action: BORROW | BookID: BK12345",
                "2024-05-21 | User: TranVanB | Action: RETURN | BookID: BK12345",
                "2024-05-22 | User: LeThiC | Action: BORROW | BookID: BK99999"
        );

        String regex = "^(\\d{4}-\\d{2}-\\d{2}) \\| User: (\\w+) \\| Action: (BORROW|RETURN) \\| BookID: (\\w+)$";
        Pattern pattern = Pattern.compile(regex);

        int borrowCount = 0;
        int returnCount = 0;

        for (String log : logs) {
            Matcher matcher = pattern.matcher(log);
            if (matcher.find()) {
                // Trích xuất dựa trên thứ tự Group
                String date = matcher.group(1);
                String user = matcher.group(2);
                String action = matcher.group(3);
                String bookId = matcher.group(4);

                // Thống kê
                if (action.equals("BORROW")) borrowCount++;
                else if (action.equals("RETURN")) returnCount++;

                // In kết quả bóc tách (như image_cde556.png)
                System.out.println("Ngày: " + date);
                System.out.println("Người dùng: " + user);
                System.out.println("Hành động: " + action);
                System.out.println("Mã sách: " + bookId);
                System.out.println("-------------------------");
            }
        }

        System.out.println("Tổng số BORROW: " + borrowCount);
        System.out.println("Tổng số RETURN: " + returnCount);
    }
}