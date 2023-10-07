package PracticalExam_01;

import java.util.Scanner;

public class ExperienceGaining_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double neededExperience = Double.parseDouble(scanner.nextLine());
        int countOfBattles = Integer.parseInt(scanner.nextLine());
        int countExperience = 0;
        for (int i = 0; i <= neededExperience; i++) {
            double experienceEarnedPerBattle = Double.parseDouble(scanner.nextLine());
               experienceEarnedPerBattle += countExperience;
            if (countOfBattles % 3 == 0){
                experienceEarnedPerBattle = experienceEarnedPerBattle * 0.15;

            }else if (countOfBattles % 5 == 0) {
                experienceEarnedPerBattle = experienceEarnedPerBattle - (experienceEarnedPerBattle * 0.10);
            }

            countExperience += experienceEarnedPerBattle;

        }
        if (countExperience >= neededExperience){
            System.out.printf("Player successfully collected his needed experience for %d battles", countOfBattles);
        }else {
            System.out.printf("Player was not able to collect the needed experience, %.2f more needed.", Math.abs(countExperience - neededExperience));
        }

    }
}
