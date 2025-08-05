package practiice;
import java.util.Scanner;
public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to find the sum of its digits:");
        int number = scanner.nextInt();
        int sum = 0;

        // Loop to calculate the sum of digits
        while (number > 0) {
            sum += number % 10; // Add the last digit to sum
            number /= 10; // Remove the last digit
        }

        System.out.println("The sum of the digits is: " + sum);
        scanner.close();
    }
}
