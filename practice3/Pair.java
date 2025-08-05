package practice3;

public class Pair<T> {
    private T first;
    private T second;

    // Constructor
    public Pair(T first, T second) {
        this.first = first;
        this.second = second;
    }

    // Getters and Setters
    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public T getSecond() {
        return second;
    }

    public void setSecond(T second) {
        this.second = second;
    }

    public static void main(String[] args) {
        // Works fine when both elements are the same type
        Pair<String> stringPair = new Pair<>("Alice", "Bob");
        Pair<Integer> intPair = new Pair<>(10, 20);

        // PROBLEM: Can't create pairs with different types
        // Pair<String> nameAge = new Pair<>("Alice", 30); // COMPILE ERROR
        // Pair<Integer> idScore = new Pair<>(101, 95.5); // COMPILE ERROR
    }
}