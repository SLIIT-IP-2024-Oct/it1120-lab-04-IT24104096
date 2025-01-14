import java.util.Scanner;

public class IT24104096Lab4Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // entering exam marks and validating
        System.out.print("Enter exam marks (out of 100): ");
        double examMarks = scanner.nextDouble();
        if (examMarks < 0 || examMarks > 100) {
            System.out.println("Error: Exam marks must be between 0 and 100.");
            return;
        }

        // Entering lab submission marks and validating
        System.out.print("Enter lab submission marks (out of 100): ");
        double labMarks = scanner.nextDouble();
        if (labMarks < 0 || labMarks > 100) {
            System.out.println("Error: Lab submission marks must be between 0 and 100.");
            return;
        }

        // Entering percentage for exam and validate
        System.out.print("Enter percentage for exam marks: ");
        double examPercentage = scanner.nextDouble();
        if (examPercentage < 0 || examPercentage > 100) {
            System.out.println("Error: Exam percentage must be between 0 and 100.");
            return;
        }

        System.out.print("Enter percentage for lab submission marks: ");
        double labPercentage = scanner.nextDouble();
        if (labPercentage < 0 || labPercentage > 100) {
            System.out.println("Error: Lab percentage must be between 0 and 100.");
            return;
        }

        if (examPercentage + labPercentage != 100) {
            System.out.println("Error: The exam percentage and lab submission percentage must add up to 100.");
            return;
        }

        // Calculating the final mark
        double finalMark = (examMarks * examPercentage / 100) + (labMarks * labPercentage / 100);

        System.out.printf("The final mark is: %.2f%n", finalMark);
    }
}
