package FinalExam;

import java.nio.charset.StandardCharsets;
import java.util.*;

public class DecryptingCommands_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();


        String inputLine = scanner.nextLine();
        while (!inputLine.equals("Finish")) {

            String[] decryptingCommands = inputLine.split(" ");
            String command = decryptingCommands[0];
            String substring = "";
            int startIndex = 0;
            int endIndex = 0;

            if (command.contains("Replace")) {
                substring = decryptingCommands[1];
                if (inputLine.contains(substring)) {
                    input = input.replace(decryptingCommands[1], decryptingCommands[2]);

                    System.out.println(input);

                }

            } else if (command.contains("Cut")) {

                startIndex = Integer.parseInt(decryptingCommands[1]);
                endIndex = Integer.parseInt(decryptingCommands[2]);

                substring = input.substring(startIndex, endIndex + 1);
                input = input.replace(substring, "");

                System.out.println(input);
                if (startIndex <= 0 && endIndex > input.length()) {

                    System.out.println("Invalid indices!");
                }


            } else if (command.contains("Make")) {
                String upperOrLower = decryptingCommands[1];
                if (upperOrLower.contains("Upper")) {
                    substring = input.toUpperCase(Locale.ROOT);
                    System.out.println(substring);

                } else if (upperOrLower.contains("Lower")) {
                    substring = input.toLowerCase(Locale.ROOT);
                    System.out.println(substring);
                }


            } else if (command.contains("Check")) {
                substring = decryptingCommands[1];
                if (Objects.equals(substring, input)) {
                    System.out.printf("Message contains %s%n", input);
                } else {
                    System.out.printf("Message doesn't contain %s%n", substring);
                }


            } else if (command.contains("Sum")) {

                startIndex = Integer.parseInt(decryptingCommands[1]);
                endIndex = Integer.parseInt(decryptingCommands[2]);
                int sum = 0;
                for (int i = startIndex; i <= endIndex + 1; i++) {

                    char symbol = scanner.nextLine().charAt(startIndex);
                    int asciiCde = (int) symbol;
                    sum += asciiCde;



                }
                System.out.printf("%d", sum);

            }


            inputLine = scanner.nextLine();

        }

    }
}
