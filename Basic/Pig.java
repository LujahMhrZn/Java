public class Pig implements Animal{
    public void animalSound() {
        System.out.println("The pig says: wee wee");
    }
    public void sleep() {
        System.out.println("Zzz");
    }
    public static void main(String[] args) {
        Pig myObject = new Pig(); // Create a Pig object
        myObject.animalSound();
        myObject.sleep();
        
    }

}