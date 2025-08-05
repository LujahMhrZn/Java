package practice2;

public class Employe {
    public int employeeId;
    private String name;
    protected double salary;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    void display(){
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {
        Employe e = new Employe();
        e.employeeId = 101;
        e.setName("Alice");
        e.salary = 50000.0;
        e.display();
    }
}
