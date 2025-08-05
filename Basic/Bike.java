abstract class Bike {
    abstract void run();
    void printDetails(){
        System.out.println("This is a bike");
    }
};

class Honda extends Bike {
    void run() {
        System.out.println("Running safely");
    }

    public static void main(String[] args) {
        Bike obj = new Honda();
        obj.run();
    }
}
