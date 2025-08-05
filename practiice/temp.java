package practiice;
import java.util.Scanner;
public class temp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Temperature to convert:");
        double temp= sc.nextDouble();
        System.out.println("Enter 1 for Celsius to Fahrenheit or 2 for Fahrenheit to Celsius:");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                // Convert Celsius to Fahrenheit
                double fahrenheit = (temp * 9/5) + 32;
                System.out.println(temp + " Celsius is " + fahrenheit + " Fahrenheit.");
                break;
            case 2:
                // Convert Fahrenheit to Celsius
                double celsius = (temp - 32) * 5/9;
                System.out.println(temp + " Fahrenheit is " + celsius + " Celsius.");
                break;
            default:
                System.out.println("Invalid choice. Please enter 1 or 2.");
                break;
        }
        sc.close();
}
}