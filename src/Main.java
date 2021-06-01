import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double studentGPA = 3.54;

        String studentFirstName = "Caia";
        String studentLastName = "Chuang";

        System.out.println(studentFirstName + " " + studentLastName + " has a GPA of " + studentGPA);
        System.out.println("What do you want to update it to?");

        Scanner input = new Scanner(System.in);
        studentGPA = input.nextDouble();

        System.out.println(studentFirstName + " " + studentLastName + " has a GPA of " + studentGPA);
    }
}
