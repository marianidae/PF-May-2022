package ExamPreparation2;

import java.util.*;

public class NeedForSpeedIII_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countCars = Integer.parseInt(scanner.nextLine());

        Map<String, List<Integer>> cars = new LinkedHashMap<>();
        for (int i = 0; i < countCars; i++) {

            String[] inputCars = scanner.nextLine().split("\\|");

            String car = inputCars[0];
            int mileage = Integer.parseInt(inputCars[1]);
            int fuel = Integer.parseInt(inputCars[2]);

            List<Integer> inputInfo = Arrays.asList(mileage, fuel);
            cars.putIfAbsent(car, inputInfo);

        }

        String command = scanner.nextLine();
        while (!command.equals("Stop")) {

            String[] commandLine = command.split(" : ");
            String commandType = commandLine[0];
            String currentCar = commandLine[1];

            switch (commandType) {
                case "Drive":
                    int distanceToDrive = Integer.parseInt(commandLine[2]);
                    int fuelNeeded = Integer.parseInt(commandLine[3]);

                    if (fuelNeeded <= cars.get(currentCar).get(1)) {
                        cars.get(currentCar).set(0, cars.get(currentCar).get(0) + distanceToDrive);
                        cars.get(currentCar).set(1, cars.get(currentCar).get(1) - fuelNeeded);
                        System.out.printf("%s driven for %d kilometers. %d liters of fuel consumed.%n", currentCar, distanceToDrive, fuelNeeded);
                    } else {
                        System.out.println("Not enough fuel to make that ride");
                    }

                    if (cars.get(currentCar).get(0) >= 100000) {
                        System.out.printf("Time to sell the %s!%n", currentCar);
                        cars.remove(currentCar);
                    }

                    break;
                case "Refuel":

                    int currentFuel = Integer.parseInt(commandLine[2]);

                    if (cars.get(currentCar).get(1) + currentFuel <= 75) {
                        System.out.printf("%s refueled with %d liters%n", currentCar, currentFuel);
                        cars.get(currentCar).set(1, cars.get(currentCar).get(1) + currentFuel);

                    } else if (cars.get(currentCar).get(1) + currentFuel > 75) {
                        System.out.printf("%s refueled with %d liters%n", currentCar, 75 - cars.get(currentCar).get(1));
                        cars.get(currentCar).set(1, 75);
                    }

                    break;
                case "Revert":

                    int currentKilometers = Integer.parseInt(commandLine[2]);

                    if (cars.get(currentCar).get(0) - currentKilometers >= 10000) {
                        System.out.printf("%s mileage decreased by %d kilometers%n", currentCar, currentKilometers);
                        cars.get(currentCar).set(0, cars.get(currentCar).get(0) - currentKilometers);
                    } else {
                        cars.get(currentCar).set(0, 10000);
                    }

                    break;

            }

            command = scanner.nextLine();
        }


        cars.forEach((key, value) -> System.out.printf("%s -> Mileage: %d kms, Fuel in the tank: %d lt.%n", key, value.get(0), value.get(1)));
    }
}
