package ExamPreparation2;

import java.util.Locale;
import java.util.Scanner;

public class ActivationKeys_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String key = scanner.nextLine();
        String instructions = scanner.nextLine();
        while (!instructions.equals("Generate")) {
            String[] commands = instructions.split(">>>");
            String cases = commands[0];
            String substring = "";
            int startIndex = 0;
            int endIndex = 0;
            switch (cases) {
                case "Contains":
                    substring = commands[1];
                    if (key.contains(substring)) {
                        System.out.printf("%s contains %s%n", key, substring);
                    } else {
                        System.out.println("Substring not found!");
                    }
                    break;
                case "Flip":
                    String upperLower = commands[1];
                    startIndex = Integer.parseInt(commands[2]);
                    endIndex = Integer.parseInt(commands[3]);
                    substring = key.substring(startIndex, endIndex);
                    if (upperLower.equals("Upper")) {
                        key = key.replace(substring, substring.toUpperCase());
                    } else if (upperLower.equals("Lower")) {
                        key = key.replace(substring, substring.toLowerCase());

                    }
                    System.out.println(key);
                    break;
                case "Slice":
                    startIndex = Integer.parseInt(commands[1]);
                    endIndex = Integer.parseInt(commands[2]);
                    substring = key.substring(startIndex, endIndex);
                    key = key.replace(substring, "");

                    System.out.println(key);
                    break;

            }
            instructions = scanner.nextLine();
        }
        System.out.printf("Your activation key is: %s%n", key);
    }
}
