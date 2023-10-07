package DataTypesAndVariables.Lab;

import java.util.Scanner;

public class P11RefactorVolumeOfPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double Length = Double.parseDouble(scanner.nextLine());
        double Width = Double.parseDouble(scanner.nextLine());
        double Height = Double.parseDouble(scanner.nextLine());



        double Volume = (Length * Width * Height) / 3;
        System.out.printf("Pyramid Volume: %.2f", Volume);

    }
}
