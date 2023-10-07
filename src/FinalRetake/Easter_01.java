package FinalRetake;

import java.util.Locale;
import java.util.Scanner;

public class Easter_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String command = scanner.nextLine();
        while (!command.equals("Easter")) {
            String[] inputLine = command.split(" ");
            String cases = inputLine[0];
            String substring = "";
            int startIndex = 0;
            int endIndex = 0;



            if (cases.contains("Replace")) {
                substring = inputLine[0];
                if (command.contains(substring)){
                    input = input.replace(inputLine[1], inputLine[2]);
                    System.out.println(input);

                }
            }else if (cases.contains("Remove")) {
                substring = inputLine[0];
                if (command.contains(substring)) {
                    input = input.replace(inputLine[1], "");
                    System.out.println(input);
                }


            }else if (cases.contains("Includes")) {
                if (input.contains(substring)) {
                    System.out.println("True");
                }else {
                    System.out.println("False");
                }


            }else if (cases.contains("Change")) {

                String upperLower = inputLine[1];


                if (upperLower.contains("Upper")) {
                    substring = input.toUpperCase(Locale.ROOT);
                }else if (upperLower.contains("Lower")) {
                    substring = input.toLowerCase(Locale.ROOT);
                }
                System.out.println(substring);

            }else if (cases.contains("Reverse")) {

                startIndex = Integer.parseInt(inputLine[1]);
                endIndex = Integer.parseInt(inputLine[2]);

                for (int i = endIndex; i > startIndex - 1; i--) {
                   char symbol = input.charAt(i);
                   substring = symbol + "";
                    System.out.print(substring);
                }



                }
              command = scanner.nextLine();
            }

        }
    }


