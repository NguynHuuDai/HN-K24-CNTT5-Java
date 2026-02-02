//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Person haBichNgoc = new Person(
                "Hà Bích Ngọc",
                19,
                false,
                true,
                true,
                false,
                true
        );
        Person NguyenVanHieu = new Person(
                "Nguyễn Văn Hiếu",
                20,
                true,
                true,
                true,
                true,
                true
        );

        Person[] CNTT5 = {haBichNgoc, NguyenVanHieu};
        for (int i = 0; i < CNTT5.length; i++){
            System.out.println(CNTT5[i]);
        }
    }
}