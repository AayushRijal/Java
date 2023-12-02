import java.util.Scanner;

public class num {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a numerical grade (0-100): ");
        int numericalGrade = scanner.nextInt();

        char grade;

        if (numericalGrade == 100 || numericalGrade >= 90) {
            grade = 'A';
        } else if (numericalGrade >= 80) {
            grade = 'B';
        } else if (numericalGrade >= 70) {
           grade= 'C';
        } else if (numericalGrade >= 60) {
           grade = 'D';
        } else if (numericalGrade >= 0) {
            grade = 'F';
        } else {
            System.out.println("Invalid input. Please enter a numerical grade between 0 and 100.");
            return;
        }

        System.out.println("The letter grade is: " + grade);

        scanner.close();
    }
}