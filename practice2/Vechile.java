package practice2;

public class Vechile {
    int year;
    String model;
    String color;

    void displayDetails() {
        System.out.println("Year: " + year);
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);
    }

    public static void main(String[] args) {
        Vechile myVechile = new Vechile();
        myVechile.year = 2020;
        myVechile.model = "Toyota";
        myVechile.color = "Red";
        myVechile.displayDetails();

    }
}