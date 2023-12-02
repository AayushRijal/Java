import java.util.Scanner; public class SimpleCalculator {
public static void main(String[] args) {
try (Scanner scanner = new Scanner(System.in)) {
    System.out.print("Enter first number: "); 
    double num1 = scanner.nextDouble();
    System.out.print("Enter operator (+, -, *, /): ");
    char operator = scanner.next().charAt(0); 
    System.out.print("Enter second number: ");
    double num2 = scanner.nextDouble(); double result;
    if (operator == '+') { result = num1 + num2; } 
    else if (operator == '-') { result = num1 - num2; }
    else if (operator == '*') { result = num1 * num2; }
    else if (operator == '/') 
    { if (num2 != 0) { result = num1 / num2; }
    else { System.out.println("Error: Cannot Divide by zero"); 
    return; } 
    }
    else { System.out.println("Invalid operator");
     return; } 
    System.out.println("Result: " + result);
} 
} 
}