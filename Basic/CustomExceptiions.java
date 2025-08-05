public class CustomExceptiions {
    static void validate(int age) throws InvalidAge {
        if (age < 18) {
            throw new InvalidAge("Age must be 18 or older");
        } else {
            System.out.println("Valid age: " + age);
        }
    }

    public static void main(String args[]) {
        try {
            validate(19);
        } catch (InvalidAge ex) {
            System.out.println("Exception caught. ");
        
            System.out.println("Exception occured:" + ex);
        }
        System.out.println("You are eligible to vote.");
    }
}