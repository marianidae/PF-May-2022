package FinalRetakeExam3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ArrivingInKathmandu_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputLine = scanner.nextLine();

        Pattern pattern = Pattern.compile("([\\?\\!\\#\\$]*)(?<name>[A-Za-z]*)[=][1-9][\\<<](?<code>[A-Za-z0-9]*)");
        Matcher matcher = pattern.matcher(inputLine);

        List<String> coordinateList = new ArrayList<>();
        while (!inputLine.equals("Last Note") && matcher.find()) {
            String name = matcher.group("name");
            String code = matcher.group("code");
            if (matcher.find()) {
                coordinateList.add(name);
                coordinateList.add(code);
                System.out.printf("Coordinates found! %s -> %s%n", name, code);
            } else {
                System.out.println("Nothing found!");
            }
            inputLine = scanner.nextLine();
        }
    }
}
