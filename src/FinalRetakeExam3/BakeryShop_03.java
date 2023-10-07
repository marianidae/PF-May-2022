package FinalRetakeExam3;

import java.util.*;

public class BakeryShop_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        while (!input.equals("Complete")) {
            String[] inputLine = scanner.nextLine().split(" ");
            String command = inputLine[0];
            int number = Integer.parseInt(inputLine[1]);
            String food = inputLine[2];
            int count = 0;
            List<String> foodList = new ArrayList<>();

            switch (command){
                case "Receive":
                    if (number <= 0) {
                        break;
                    } else {
                        count += number;
                    }
                    foodList.add(food);

                    break;
                case "Sell":
                    if (!foodList.contains(food)) {
                        System.out.printf("You do not have any %s%n", food);
                    }
                    if (count < number) {
                        System.out.printf("There aren`t enough %s. You sold the last %d of them.%n", foodList.contains(food), count-number);
                    } else {
                        System.out.printf("You sold %d %s.%n", count, food);
                    }
                    if (count == 0) {
                        foodList.remove(food);
                    } else {
                        System.out.printf("You sold %d %s.%n", count, foodList.contains(food));
                    }
                    break;
            }
            input = scanner.nextLine();
        }
    }
}
