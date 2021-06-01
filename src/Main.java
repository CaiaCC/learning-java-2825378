import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        StudentProfile studentA = new StudentProfile("Caia", "Chuang", 2020, 4.0, "CS");
        StudentProfile studentB = new StudentProfile("Trent", "You", 2021, 3.0, "CS");

        studentB.incrementExpectedGraduationYear();
        System.out.println(studentB.expectedYearToGraduate);
    }
}
