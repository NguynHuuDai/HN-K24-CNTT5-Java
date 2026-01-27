import java.util.Scanner;

public class bt1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số lượng sách cần quản lý: ");
        int n = sc.nextInt();

        int[] books = addBookToLibraries(n, sc);
        displayLibraries(books);
    }

    public static int[] addBookToLibraries(int n, Scanner sc) {
        int[] arr = new int[n];

        System.out.println("Nhập mã sách:");
        for (int i = 0; i < n; i++) {
            System.out.printf("Sách thứ %d: ", i + 1);
            arr[i] = sc.nextInt();
        }

        return arr;
    }

    public static void displayLibraries(int[] arr) {
        System.out.println("--- KẾT QUẢ ---");
        System.out.print("Danh sách mã sách: ");
        for (int i = 0; i < arr.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(arr[i]);
        }
    }
}