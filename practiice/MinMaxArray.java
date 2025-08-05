package practiice;

public class MinMaxArray {
    public static void main(String[] args) {
        // Declare and initialize the array
        int[] numbers = {45, 22, 89, -5, 16, 73, 2};

        // Assume first element is both min and max
        int min = numbers[0];
        int max = numbers[0];

        // Loop through the array
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i]; // new max found
            }
            if (numbers[i] < min) {
                min = numbers[i]; // new min found
            }
        }

        // Print results
        System.out.println("Largest number: " + max);
        System.out.println("Smallest number: " + min);
    }
}
