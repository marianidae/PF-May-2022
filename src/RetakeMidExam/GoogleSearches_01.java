package RetakeMidExam;

import java.util.Scanner;

public class GoogleSearches_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double moneyPerSearch = Double.parseDouble(scanner.nextLine());
        double numbersOfUsers = Double.parseDouble(scanner.nextLine());
        double countMoney = 0;
        for (int i = 1; i <= numbersOfUsers; i++) {
            double money = 0;
            double numbersOfSearches = Double.parseDouble(scanner.nextLine());

            if (numbersOfSearches > 5) {
               money = moneyPerSearch * numbersOfSearches * 2;


            }
            if (numbersOfSearches == 1) {
                continue;
            }
            if (i % 3 == 0) {
                money = numbersOfSearches * moneyPerSearch * 3;
                if (numbersOfSearches >= 5) {
                    money = money * 2;
                } else if (numbersOfUsers == 3) {
                    continue;
                }

            }
            countMoney += money;

        }
        System.out.printf("Total money earned: %.2f", countMoney);
    }
}
