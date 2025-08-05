package practiice;

import java.util.Scanner;

public class helo {
    public void display(){
        System.out.println("Hello, World!");
    }

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    

    System.out.println("Enter two numbers:");
    int num1 = sc.nextInt();
    int num2 = sc.nextInt();
    int sum = calculate(num1, num2);
    helo hello = new helo();
    hello.display();
    hello.show();
    System.out.println("The sum is: " + sum);
    sc.close();
}
    



 void show() {
    System.out.println("Hello, NIGGAld!");
}

static int calculate(int a, int b) {
    return a + b;
}

}