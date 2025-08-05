package Generic;

public class Employee<T> {
    private T employeeId;

    public Employee(T employeeId) {
        this.employeeId = employeeId;
    }

    public T getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(T employeeId) {
        this.employeeId = employeeId;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                '}';
    }
}