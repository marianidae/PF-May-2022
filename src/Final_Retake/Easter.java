package Final_Retake;

import java.util.Locale;
import java.util.Scanner;

public class Easter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String instruction = scanner.nextLine();

        while (!instruction.equals("Easter")) {
            String[] commands = instruction.split(" ");
            String cases = commands[0];
            String currentChar = "";
            String newChar = "";
            String substring = "";
            int startIndex = 0;
            int endIndex = 0;
            switch (cases) {
                case "Replace":
                    currentChar = commands[1];
                    newChar = commands[2];
                    if (instruction.contains(newChar)) {
                        input = input.replace(currentChar, newChar);
                        System.out.println(input);
                    }
                    break;
                case "Remove":
                    substring = commands[1];
                    if (instruction.contains(substring)) {

                        input = input.replace(substring, "");
                        System.out.println(input);
                    }
                    break;
                case "Includes":
                    substring = commands[1];
                    if (substring.equals(input)){
                        System.out.println("True");
                    }else {
                        System.out.println("False");
                    }
                    break;
                case "Change":
                    String upperLower = commands[1];
                    if (upperLower.equals("Upper")) {
                        substring = input.replace(input, substring.toUpperCase(Locale.ROOT));
                        System.out.println(substring);
                    } else if (upperLower.equals("Lower")) {
                        substring = input.replace(input, substring.toLowerCase(Locale.ROOT));
                        System.out.println(substring);
                    }
                    break;
                    case "Reverse":
                        startIndex = Integer.parseInt(commands[1]);
                        endIndex = Integer.parseInt(commands[2]);

//                        StringBuilder sb = new StringBuilder(input);
//                            sb.replace(startIndex, endIndex, substring);
//                        if (startIndex <= 0 && endIndex > input.length()) {
//                                continue;
//                            }else {
//                                System.out.println(sb);
//                            }
                        break;
            }

            instruction = scanner.nextLine();
        }
    }

}


