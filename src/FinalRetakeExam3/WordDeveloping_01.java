package FinalRetakeExam3;

import java.util.Scanner;

public class WordDeveloping_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = "";

        String text = "";
        while (!input.equals("End")) {
            String[] inputLine = input.split(" ");
            String command = inputLine[0];
            String substring = "";
            int index = 0;


            switch (command) {
                case "Add":
                    substring = inputLine[1];
                    text += substring;
                    break;
                case "Upgrade":
                    index = Integer.parseInt(inputLine[1]);



                    break;
                case "Print":
                    System.out.printf("%s%n", text);
                    break;
                case "Index":
                    index = Integer.parseInt(inputLine[1]);

                    for (int i = 0; i <= text.length(); i++) {

                        char symbol = scanner.nextLine().charAt(0);

                            int count = (int) symbol;
                            index = index + symbol;
                        System.out.printf("%d %d%n", index, index);
                    }
                    break;
                case "Remove":
                    substring = inputLine[1];
                    if (text.contains(substring)) {
                       text = text.replace(substring, "");
                    }
                    break;
            }
            input = scanner.nextLine();
        }
    }
}
