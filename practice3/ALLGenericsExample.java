package practice3;

import Animal;
import Dog;

// Generic class with one parameter
class Box<T> {
    private T value;

    public void set(T value) { this.value = value; }
    public T get() { return value; }
}

// Generic class with two parameters
class Pair<K, V> {
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() { return key; }
    public V getValue() { return value; }
}

// Generic method
class Utility {
    public static <T> void printArray(T[] array) {
        for (T val : array)
            System.out.print(val + " ");
        System.out.println();
    }

    public static <T> void swap(T[] array, int i, int j) {
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}

// Generic constructor
class Printer {
    <T> Printer(T value) {
        System.out.println("Printing: " + value);
    }
}

// Polymorphism with bounded generics
class Animal {
    void speak() {
        System.out.println("Animal speaks");
    }
}

class Dog extends Animal {
    void speak() {
        System.out.println("Dog barks");
    }
}

class AnimalBox<T extends Animal> {
    T animal;

    AnimalBox(T animal) {
        this.animal = animal;
    }

    void makeSound() {
        animal.speak(); // polymorphic
    }
}

public class ALLGenericsExample {
    public static void main(String[] args) {
        // Using generic class
        Box<String> strBox = new Box<>();
        strBox.set("Hello Generics");
        System.out.println("Box contains: " + strBox.get());

        // Using generic class with multiple params
        Pair<Integer, String> student = new Pair<>(1, "Lujah");
        System.out.println("Pair: " + student.getKey() + " -> " + student.getValue());

        // Using generic method
        Integer[] nums = {1, 2, 3, 4};
        String[] words = {"Java", "Generics", "Fun"};

        Utility.printArray(nums);
        Utility.printArray(words);

        Utility.swap(nums, 0, 3);
        Utility.printArray(nums);

        // Generic constructor
        new Printer("Constructor with Generics");
        new Printer(404);

        // Using polymorphism with generics
        AnimalBox<Dog> dogBox = new AnimalBox<>(new Dog());
        dogBox.makeSound(); // Dog barks
    }
}
