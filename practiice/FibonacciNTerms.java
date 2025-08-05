package practiice;

import java.util.Scanner;

public class FibonacciNTerms {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter how many terms (n): ");
        int n = sc.nextInt();

        int a = 0, b = 1;

        System.out.println("First " + n + " terms of Fibonacci series:");
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        sc.close();
    }

}
