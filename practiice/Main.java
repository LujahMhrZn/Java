package practiice;

// Class Definition
class Student {
    // Attributes (also called fields)
    int roll;
    String name;

    // Method to display student info
    void display() {
        System.out.println("Roll: " + roll);
        System.out.println("Name: " + name);
    }
}

// Main class to run the program
public class Main {
    public static void main(String[] args) {
        // Creating an object (instance) of Student
        Student s1 = new Student();

        // Assigning values to the object
        s1.roll = 101;
        s1.name = "Lujah";

        // Calling a method using the object
        s1.display();
    }
}

