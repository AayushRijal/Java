import java.util.Scanner;

public class day{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a float number: ");

        if (scanner.hasNextFloat()) {
            float floatValue = scanner.nextFloat();
            System.out.println("You entered: " + floatValue);
        } else {
            System.out.println("Invalid input. Please enter a valid float number.");
        }

        scanner.close();
    }
}