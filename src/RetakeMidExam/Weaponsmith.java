package RetakeMidExam;

import java.util.Scanner;
import java.util.StringJoiner;

public class Weaponsmith {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] nameWeapon = scanner.nextLine().split("\\|");

        String command = scanner.nextLine();

        while (!command.equals("Done")){
            String[] inputCommand = scanner.nextLine().split(" ");
            String commandType = inputCommand[0];

            if (commandType.equals("Add")){
               String particle = inputCommand[1];
               int index = Integer.parseInt(inputCommand[2]);



            }else if (commandType.equals("Remove")){
               int index = Integer.parseInt(inputCommand[1]);

            }else if (commandType.equals("Check Even")){


            }else if (commandType.equals("Check Odd")){

            }



            command = scanner.nextLine();
        }

    }
}
