public class BTTH {
    public static void main(String[] args){

        BTTH_Person s1 = new BTTH_Person("SV01","Nguyễn Hữu Đại");
        BTTH_Person s2 = new BTTH_Person("SV02","Nguyễn Hữu Đào");
        BTTH_Person s3 = new BTTH_Person("SV03","Nguyễn Hữu Minh");
        BTTH_Person s4 = new BTTH_Person("SV04","Nguyễn Hữu Linh");
        BTTH_Person s5 = new BTTH_Person("SV05","Nguyễn Hữu Ngọc");

        s1.displayInfo();
        s2.displayInfo();
        s3.displayInfo();
        s4.displayInfo();
        s5.displayInfo();

        BTTH_Person.showTotalStudent();
    }
}