package practiice;

// Base class (Parent)
class Student {
    int roll;
    String name;

    // Constructor to initialize values
    Student(int r, String n) {
        roll = r;
        name = n;
    }

    // Method to display student info
    void display() {
        System.out.println("Roll: " + roll);
        System.out.println("Name: " + name);
    }
}

// Derived class (Child) using Inheritance
class CollegeStudent extends Student {
    String college;

    // Constructor calling parent constructor using super()
    CollegeStudent(int r, String n, String c) {
        super(r, n);         // Calls Student class constructor
        college = c;
    }

    // Overriding display method to include college
    @Override
    void display() {
        super.display();     // Calls parent class display
        System.out.println("College: " + college);
    }
}

// Main class
public class StudentMain {
    public static void main(String[] args) {
        // Creating multiple objects
        CollegeStudent s1 = new CollegeStudent(101, "Lujah", "SAIM");
        CollegeStudent s2 = new CollegeStudent(102, "Aayush", "KU");

        // Displaying information
        System.out.println("Student 1:");
        s1.display();

        System.out.println("\nStudent 2:");
        s2.display();
    }
}
