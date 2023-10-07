package ObjectsAndClasses.Article_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Article_2> article2List = new ArrayList<>();

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= n; i++) {
            String articleData = scanner.nextLine();
            String title = articleData.split(", ")[0];
            String content = articleData.split(", ")[1];
            String author = articleData.split(", ")[2];

            Article_2 article = new Article_2(title, content, author);
            article2List.add(article);
        }
        String input = scanner.nextLine();
        if (input.equals("title") || input.equals("content") || input.equals("author")) {
            for (Article_2 article : article2List) {
                System.out.println(article.toString());
            }
        }


    }


}

