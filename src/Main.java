import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Primitive types
//        int studentAge = 15;
        double studentGPA = 3.54;
//        boolean hasPerfectAttendance = true;
//        String studentName = "Caia Chuang";
        String studentFirstName = "Caia";
        String studentLastName = "Chuang";
//        char studentFirstInitial = studentFirstName.charAt(0);
//        char studentLastInitial = studentLastName.charAt(0);

//        System.out.println(studentAge);
//        System.out.println(studentGPA);
//        System.out.println(hasPerfectAttendance);
//        System.out.println(studentFirstName);
//        System.out.println(studentLastName);
//        System.out.println(studentFirstInitial);
//        System.out.println(studentLastInitial);

        System.out.println(studentFirstName + " " + studentLastName + " has a GPA of " + studentGPA);
        System.out.println("What do you want to update it to?");

        Scanner input = new Scanner(System.in);
        studentGPA = input.nextDouble();

        System.out.println(studentFirstName + " " + studentLastName + " has a GPA of " + studentGPA);
    }
}
