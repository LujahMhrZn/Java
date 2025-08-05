package practice2;

import java.util.Scanner;

public class ArrayCal{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[]arr = new int[5];
        System.out.println("Enter " + n + " elements:");
        for(int i=0; i <n; i++){
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        int avg =0;
        int product = 1;

        for( int i = 0; i < n; i++){
            sum += arr[i];
            product *= arr[i];
            avg = sum / n;
        }

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + avg);
        System.out.println("Product: " + product);

        sc.close();
    }
}