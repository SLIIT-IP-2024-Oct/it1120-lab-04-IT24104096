import java.util.Scanner;

public class IT24104096Lab4Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entering a number from the user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Checking the number
        if (number > 0) {
            System.out.println("The number is Positive.");
        } else if (number < 0) {
            System.out.println("The number is Negative.");
        } else {
            System.out.println("The number is Zero.");
        }
    }
}
