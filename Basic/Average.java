import java.util.Scanner;
public class Average {
    static double sum = 0;
    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.print("Enter the number of elements to enter: ");
    int n = input.nextInt();

    int[] num = new int[n];

    for(int i = 0; i < n; i++) {
        System.out.print("Enter number " + (i + 1) + ":");
        num[i] = input.nextInt();
        sum += num[i];
    }


    double avg = (double) sum / n;

     System.out.println("The average is: " + avg); 
    
    }
}