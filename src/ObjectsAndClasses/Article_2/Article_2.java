package ObjectsAndClasses.Article_2;

public class Article_2 {
    private String title;
    private String content;
    private String author;

    public Article_2 (String title, String content, String author) {

        this.title = title;
        this.content = content;
        this.author = author;
    }
    @Override
    public String toString() {
        return this.title + " - " + this.content + ": " + this.author;
    }
}
