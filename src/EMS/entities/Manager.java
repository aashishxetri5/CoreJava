package EMS.entities;

public class Manager extends Employee {
    private double bonus;

    public Manager() {
    }

    public Manager(String name, String department, int age, double salary, double bonus) {
        super(name, department, age, salary);
        this.bonus = bonus;
    }

    public double calculateTotalSalary() {
        return getSalary() + bonus;
    }

    @Override
    public void displayEmployeeInfo() {
        super.displayEmployeeInfo();
        System.out.println("Bonus: " + bonus);
        System.out.println("Total Salary: " + calculateTotalSalary());
    }
}
