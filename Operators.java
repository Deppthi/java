import java.util.Scanner;

public class Operators {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	    
	        System.out.print("Enter the first number: ");
	        double num1 = scanner.nextDouble();

	        System.out.print("Enter the second number: ");
	        double num2 = scanner.nextDouble();
         
	        double sum = num1 + num2;
            double average=sum/2;
	        double difference = num1 - num2;
	        double product = num1 * num2;
	        double quotient = 0;
	        if (num2 != 0) {
	            quotient = num1 / num2;
	        } else {
	            System.out.println("Cannot divide by zero.");
	        }

	        System.out.println("Arithmetic Operations:");
            System.out.println("average: " + average);
	        System.out.println("Sum: " + sum);
	        System.out.println("Difference: " + difference);
	        System.out.println("Product: " + product);
	        if (num2 != 0) {
	            System.out.println("Quotient: " + quotient);
	        }

	        scanner.close();
	    }
	}