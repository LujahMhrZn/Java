package Generic;

public class GenericArray {
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
    public static <T> void printElement(T element) {
        System.out.println(element);
    }

    public static void main(String[] args) {
        printElement(10);
        printElement("Hello");
        printElement(3.14);

  
        String[] strArray = {"A", "B", "C", "D"};
  
        printArray(strArray); // This will compile, as String[] is T[]

    }
}
