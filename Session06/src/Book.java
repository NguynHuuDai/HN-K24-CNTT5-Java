public class Book {
    private String id;
    private String title;
    private String author;

    public Book(String id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    public void display() {
        System.out.println("Ma sach: " + id);
        System.out.println("Tieu de: " + title);
        System.out.println("Tac gia: " + author);
        System.out.println("------------------");
    }
}