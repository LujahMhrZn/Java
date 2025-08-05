package practice3;

public class AgeValidator {
    public static void main(String[] args) {
        try {
            validateAge(15);
        } catch (InvalidAgeException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
}
      public static void validateAge(int age) throws InvalidAgeException{
            if (age < 18) {
                throw new InvalidAgeException("Age must be at least 18.");
            } else {
                System.out.println("Age is valid: " + age);
            }
        }
    }