package ObjectsAndClasses.Article;

public class Articles_02 {

    private String title;
    private String content;
    private String author;

    public Articles_02 (String title, String content, String author) {

        this.title = title;
        this.content = content;
        this.author = author;
    }

    public void edit (String newContent) {
        this.content = newContent;
    }

    public void changeAuthor (String newAuthor) {
        this.author = newAuthor;
    }

    public void rename (String newTitle) {
        this.title = newTitle;
    }

    @Override
    public String toString() {
        return this.title + " - " + this.content + ": " + this.author;
    }
}
