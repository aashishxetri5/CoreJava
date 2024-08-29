package EMS.main;

import EMS.entities.Employee;
import EMS.entities.Manager;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee developer = new Employee("Aashish Katwal", "Tech", 22, 40_000);
        Manager engineerManager = new Manager("Chaitanya Sah", "RND", 26, 80_000, 15_000);

        System.out.println("-------------Employee Details-------------");
        developer.displayEmployeeInfo();

        System.out.println("\n-------------Manager Details-------------");
        engineerManager.displayEmployeeInfo();

        developer.raiseSalary(10);
        engineerManager.raiseSalary(10);

        System.out.println("\n-------------Employee Details-------------");
        developer.displayEmployeeInfo();

        System.out.println("\n-------------Manager Details-------------");
        engineerManager.displayEmployeeInfo();

    }
}
