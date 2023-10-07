package BasicSyntax.Exe;

import java.util.Scanner;

public class TriangleOfNumbers_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n ; i++) {

            for (int count = 1; count <= i ; count++) {
                System.out.print(i + " ");
            }
            System.out.println();

        }
    }
}
