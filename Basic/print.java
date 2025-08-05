import java.util.Scanner;
 class print {
    public static void main(String[] args) {
        // Scanner input = new Scanner(System.in);

        // System.out.print("Enter Floating Point Number: ");
        // float f = input.nextFloat();
        // System.out.print("You entered: " + f + "\n");

        // System.out.print("Enter Integer Number: ");
        // int i = input.nextInt();
        // System.out.print("You entered: " + i + "\n");

        // System.out.print("Enter String: ");
        // String s = input.next();
        // System.out.print("You entered: " + s + "\n");

        // System.out.print("Enter Double: ");
        // double d = input.nextDouble();
        // System.out.print("You entered: " + d + "\n");

        // input.close();


        if(args.length == 0){
            System.out.println("No arguments passed");
        }else{
            for(String arg : args){
                System.out.println(arg);
            }
        }
    }
}
 