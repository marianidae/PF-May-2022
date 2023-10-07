package Methods.Lab;

import java.util.Scanner;

public class P05Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        int number = Integer.parseInt(scanner.nextLine());

        switch (product){
            case "coffee":
                coffeeDrink(number);
                break;
            case "water":
                waterDrink(number);
                break;
            case "coke":
                cokeDrink(number);
                break;
            case "snacks":
                snacksDrink(number);
                break;
        }

    }
    public static void coffeeDrink(int number) {
        double result = number * 1.50;
        System.out.printf("%.2f", result);
    }
    public static void waterDrink(int number) {
        double result = number * 1.00;
        System.out.printf("%.2f", result);
    }
    public static void cokeDrink(int number) {
        double result = number * 1.40;
        System.out.printf("%.2f", result);
    }
    public static void snacksDrink(int number) {
        double result = number * 2.00;
        System.out.printf("%.2f", result);
    }
}
