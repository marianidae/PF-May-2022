package FinalRetake;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MessageEncrypter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        String inputLine = scanner.nextLine();

        Pattern pattern = Pattern.compile("/([\\*\\@])(?<message>[A-Z][A-Za-z]{2,})([\\*\\@]): \\[(?<code1>[A-Za-z]{1})]\\|\\[(?<code2>[A-Za-z]{1})]\\|\\[(?<code3>[A-Za-z]{1})]/gm");
        Matcher matcher = pattern.matcher(inputLine);
        List<String> messageList = new ArrayList<>();

        while (matcher.find()) {

            String message = matcher.group("message");
            char code1 = matcher.group("code1").toCharArray()[1];
            char code2 = matcher.group("code2").toCharArray()[2];
            char code3 = matcher.group("code3").toCharArray()[3];

            if (message.matches(message)) {
                System.out.printf("%s: %d %d %d%n", message, code1, code2, code3);
            }else {
                System.out.println("Valid message not found!");
            }
        }

    }
}
