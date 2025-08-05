public class NullPointerExceptionDemo {
    public static void main(String[] args) {
        try{
            String nullString = null;
            System.out.println(nullString.length());
            System.out.println("Tis code will not be executed.");
        } catch (NullPointerException e) {
            System.out.println("A NullPointerException has occurred.");
            System.out.println("Message: " + e.getMessage());
            System.out.println("Attemped to access a method on a null object.");
        }
        System.out.println("This code will be executed after the exception is handled.");
    }

}