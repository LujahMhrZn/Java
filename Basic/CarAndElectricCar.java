public class CarAndElectricCar {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Camry", 2020, "Gasoline");
        ElectricCar electricCar = new ElectricCar("Tesla", "Model S", 2021, 100);

        car.start();
        car.accelerate();
        car.displayInfo();

        electricCar.start();
        electricCar.accelerate();
        electricCar.displayInfo();
        electricCar.charge();
    }
}
