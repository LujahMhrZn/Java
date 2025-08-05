public class Car {
    private String make;
    private int year;
    private String model;
    private String FuelType;

    public Car(String make, String model, int year, String FuelType){
        this.model = model;
        this.make = make;
        this.year = year;
        this.FuelType = FuelType; 
    }

    public void start() {
        System.out.println("Car is starting.");
    }

    public void accelerate() {
        System.out.println("Car is accelerating.");
    }

    public void displayInfo() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Fuel Type: " + FuelType);
    }
}

