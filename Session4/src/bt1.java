import java.util.Scanner;

public class bt1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập tên sách: ");
        String title = sc.nextLine();

        System.out.print("Nhập tên tác giả: ");
        String author = sc.nextLine();

        title = title.trim();
        author = author.trim();

        title = title.toLowerCase();
        author = author.toLowerCase();

        title = title.toUpperCase();

        String cleanAuthor = "";
        boolean capitalize = true;

        for (int i = 0; i < author.length(); i++) {
            char c = author.charAt(i);

            if (c == ' ') {
                cleanAuthor += c;
                capitalize = true;
            } else {
                if (capitalize) {
                    cleanAuthor += Character.toUpperCase(c);
                    capitalize = false;
                } else {
                    cleanAuthor += c;
                }
            }
        }

        author = cleanAuthor;

        String result = "[" + title + "] - Tác giả: " + author;
        System.out.println(result);
    }
}
