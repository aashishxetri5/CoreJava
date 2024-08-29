package EMS.entities;

public class Employee {

    private String name;
    private String department;
    private int age;
    private double salary;

    public Employee() {
    }

    public Employee(String name, String department, int age, double salary) {
        this.name = name;
        this.department = department;
        this.age = age;
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary(double increment) {
        salary += salary * (increment / 100);
    }

    public void displayEmployeeInfo() {
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
    }
}
