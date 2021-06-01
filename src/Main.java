import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String q = "3 + 1 * 2 = ?";
        String choiceOne = "The answer is 8";
        String choiceTwo = "The answer is 5";
        String choiceThree = "I don't know";

        int correctAnswer = 2;


        System.out.println(q);
        System.out.println("1) " + choiceOne);
        System.out.println("2) " + choiceTwo);
        System.out.println("3) " + choiceThree);
        System.out.println("What is your answer?");

        Scanner input = new Scanner(System.in);
        
        int userInput = input.nextInt();

        if (userInput == correctAnswer) {
            System.out.println("You are right!");
        } else {
            System.out.println("You are wrong! The correct answer is 2!");
        }

    }
}
