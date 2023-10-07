package ObjectsAndClasses.Students;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Students> studentList = new ArrayList<>();
        int n = Integer.parseInt(scanner.nextLine()); //брой на студентите
        for (int studentCount = 1; studentCount <= n; studentCount++) {
            String personalData = scanner.nextLine();
            //"Lakia Eason 3.90".split(" ") -> ["Lakia", "Eason", "3.90"]
            String firstName = personalData.split(" ")[0];
            String lastName = personalData.split(" ")[1];
            double grade = Double.parseDouble(personalData.split(" ")[2]);

            Students student = new Students(firstName, lastName, grade);
            studentList.add(student);
        }

        //списък с обекти от клас Student
        studentList.sort(Comparator.comparingDouble(Students :: getGrade) //ascending order по оценка
                .reversed()); //descending order по оценка

        for (Students student : studentList) {
            System.out.println(student.toString());
        }
    }
}
