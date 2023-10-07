package Final_Retake;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MessageEncrypter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Pattern pattern = Pattern.compile("([*@])(?<request>[A-Z][A-Za-z]{2,})\\\\1: (?<index>[A-Za-z]{3})\\\\|");

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();


            Matcher matcher = pattern.matcher(input);

            if (matcher.find()) {
                String request = matcher.group("request");
                String index = matcher.group("index");
                StringBuilder sb = new StringBuilder();

                for (int j = 0; j < index.charAt(Integer.parseInt(index)); j++) {
                    int digit = index.charAt(j);
                    sb.append(digit).append(" ");

                }
                System.out.print(request + ": " + sb);
            } else {
                System.out.println("Valid message not found!");
            }
            
        }
    }
}
