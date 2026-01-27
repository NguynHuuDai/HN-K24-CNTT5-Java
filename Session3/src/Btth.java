import java.util.Scanner;

public class Btth {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int choice, count = 0;
        int[] ids = new int[100];
        String[] title = new String[100];
        int[] quantities= new int[100];

        do{
            System.out.println("1.Xem danh sách\n2.Thêm sách mới\n3.Cập nhật số lượng\n4.Xóa sách\n5.Tìm kiếm\n6.Sắp xếp theo số lượng\n7.Thoát");
            System.out.print("Nhập lựa chọn: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice){
                case 1:
                    if(count > 0) {
                        for (int i = 0; i < count; i++) {
                            System.out.printf("%d | %s | %d\n", ids[i], title[i], quantities[i]);
                        }
                    }else{
                        System.out.println("Chưa có giá trị nào trong mảng");
                    }
                    break;

                case 2:
                    if(count >= ids.length){
                        System.out.println("Mảng đã đạt kích thước tối đa không thể thêm mới");
                        break;
                    }

                    System.out.print("Nhập mã sách: ");
                    int test = sc.nextInt();
                    sc.nextLine();

                    boolean exists = false;
                    for(int i = 0; i < count; i++){
                        if(ids[i] == test){
                            exists = true;
                            break;
                        }
                    }

                    if(exists){
                        System.out.println("Mã sách đã tồn tại, không thể thêm");
                        break;
                    }

                    System.out.print("Nhập tên sách: ");
                    String name = sc.nextLine();

                    System.out.print("Nhập số lượng sách: ");
                    int q = sc.nextInt();

                    ids[count] = test;
                    title[count] = name;
                    quantities[count] = q;
                    count++;

                    System.out.println("Thêm thành công!");
                    break;

                case 3:
                    System.out.print("Nhập mã sách cần cập nhật: ");
                    int up = sc.nextInt();
                    boolean found = false;
                    for(int i = 0; i < count; i++){
                        if(ids[i] == up){
                            System.out.print("Nhập số lượng mới: ");
                            quantities[i] = sc.nextInt();
                            System.out.println("Cập nhật thành công!");
                            found = true;
                            break;
                        }
                    }
                    if(!found) System.out.println("Không tìm thấy mã sách!");
                    break;

                case 4:
                    System.out.print("Nhập mã sách cần xóa: ");
                    int del = sc.nextInt();
                    boolean removed = false;
                    for(int i = 0; i < count; i++){
                        if(ids[i] == del){
                            for(int j = i; j < count-1; j++){
                                ids[j] = ids[j+1];
                                title[j] = title[j+1];
                                quantities[j] = quantities[j+1];
                            }
                            count--;
                            System.out.println("Xóa thành công!");
                            removed = true;
                            break;
                        }
                    }
                    if(!removed) System.out.println("Không tìm thấy mã sách!");
                    break;

                case 5:
                    System.out.print("Nhập từ khóa: ");
                    String key = sc.nextLine().toLowerCase();
                    boolean match = false;
                    for(int i = 0; i < count; i++){
                        if(title[i].toLowerCase().contains(key)){
                            System.out.printf("%d | %s | %d\n", ids[i], title[i], quantities[i]);
                            match = true;
                        }
                    }
                    if(!match) System.out.println("Không tìm thấy sách phù hợp!");
                    break;

                case 6:
                    for(int i = 0; i < count-1; i++){
                        for(int j = i+1; j < count; j++){
                            if(quantities[i] < quantities[j]){
                                int tempQ = quantities[i];
                                quantities[i] = quantities[j];
                                quantities[j] = tempQ;

                                int tempId = ids[i];
                                ids[i] = ids[j];
                                ids[j] = tempId;

                                String tempT = title[i];
                                title[i] = title[j];
                                title[j] = tempT;
                            }
                        }
                    }
                    System.out.println("Sắp xếp thành công!");
                    break;

                case 7:
                    System.out.println("Thoát chương trình...");
                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }

        }while (choice != 7);
    }
}
