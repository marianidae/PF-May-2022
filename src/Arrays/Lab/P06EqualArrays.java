package Arrays.Lab;

import java.util.Scanner;

public class P06EqualArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] firstArray = scanner.nextLine().split(" ");
        int[] numberFirst = new int[firstArray.length];

        String[] secondArray = scanner.nextLine().split(" ");
        int[] numberSecond = new int[secondArray.length];

        int sumFirst = 0;
        int diffrent = 0;
        int position = 0;

        for (int i = 0; i < firstArray.length; i++) {
            numberFirst[i] = Integer.parseInt(firstArray[i]);
            numberSecond[i] = Integer.parseInt(secondArray[i]);
            if (numberFirst[i] != numberSecond[i]){
                diffrent++;
                position = i;
                break;
            }
            sumFirst += numberFirst[i];
        }

        if (diffrent == 0){
            System.out.printf("Arrays are identical. Sum: %d",sumFirst);
        }else {
            System.out.printf("Arrays are not identical. Found difference at %d index.",position);
        }
    }
}
