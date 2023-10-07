package PracticalExam_01;

import java.util.Scanner;

public class TaxCalculator_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] vehiclesArr = scanner.nextLine().split(">>");
        double total = 0;
        double totalTax = 0;
        for (int i = 0; i < vehiclesArr.length; i++) {
            String[] vehicles = vehiclesArr[i].split(" ");
            String typeCar = vehicles[0];
            double yearsTax = Double.parseDouble(vehicles[1]);
            double kilometers = Double.parseDouble(vehicles[2]);

            if (typeCar.equals("family")){

                totalTax = kilometers / 3000 * 12 + (50 - yearsTax * 5);
                System.out.printf("A %s car will pay %.2f euros in taxes.%n" , typeCar, totalTax);

                total += totalTax;


            }else if (typeCar.equals("heavyDuty")){

                totalTax = kilometers / 9000 * 14 + (80 - yearsTax * 8);
                System.out.printf("A %s car will pay %.2f euros in taxes.%n" , typeCar, totalTax);

                total += totalTax;


            }else if (typeCar.equals("sports")){

                totalTax = kilometers / 2000 * 18 + (100 - yearsTax * 9);
                System.out.printf("A %s car will pay %.2f euros in taxes.%n" , typeCar, totalTax);

                total += totalTax;


            }else {
                System.out.println("Invalid car type.");
            }
            
        }
        System.out.printf("The National Revenue Agency will collect %.2f euros in taxes.", total);

    }
}
