package practiice;
import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = input.next();
        System.out.println("hello " + name);
        System.out.println("Enter your age:");
        int age = input.nextInt();
        System.out.println("You are " + age + " years old.");
        input.close();
    }
}
