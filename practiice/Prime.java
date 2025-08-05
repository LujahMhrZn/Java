package practiice;

import java.util.Scanner;

public class Prime {

    public static void main(String[] args) {
        System.out.println("Enter a number to check if it is odd or even:");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        input.close();
        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }

    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false; // Numbers less than or equal to 1 are not prime
        }
        for (int i = 2; i <= num/2; i++) {
            if (num % i == 0) {
                return false; // Found a divisor, so it's not prime
            }
        }
        return true; // No divisors found, so it's prime
    }
}
