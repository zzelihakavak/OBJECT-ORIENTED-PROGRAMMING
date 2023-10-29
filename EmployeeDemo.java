import java.util.Scanner;

public class EmployeeDemo {
    private static class Employee {
        private String name;
        private int socialSecurityNumber;
        private float wage;
        private int workingHours;

        public Employee(String name, int socialSecurityNumber, float wage, int workingHours) {
            this.name = name;
            this.socialSecurityNumber = socialSecurityNumber;
            this.wage = wage;
            this.workingHours = workingHours;
        }

        public void displayInfo() {
            System.out.println("Name: " + name);
            System.out.println("Social Security Number: " + socialSecurityNumber);
        }

        public void displaySalary() {
            float salary = wage * workingHours;
            System.out.println("Salary: $" + salary);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter name for Employee 1: ");
        String name1 = scanner.nextLine();
        System.out.print("Enter Social Security Number for Employee 1: ");
        int ssn1 = scanner.nextInt();
        System.out.print("Enter wage for Employee 1: ");
        float wage1 = scanner.nextFloat();
        System.out.print("Enter working hours for Employee 1: ");
        int hours1 = scanner.nextInt();

        Employee employee1 = new Employee(name1, ssn1, wage1, hours1);

        scanner.nextLine();
        System.out.print("Enter name for Employee 2: ");
        String name2 = scanner.nextLine();
        System.out.print("Enter Social Security Number for Employee 2: ");
        int ssn2 = scanner.nextInt();
        System.out.print("Enter wage for Employee 2: ");
        float wage2 = scanner.nextFloat();
        System.out.print("Enter working hours for Employee 2: ");
        int hours2 = scanner.nextInt();

        Employee employee2 = new Employee(name2, ssn2, wage2, hours2);

        System.out.println("Employee 1 Information:");
        employee1.displayInfo();

        System.out.println("Employee 2 Information:");
        employee2.displayInfo();

        scanner.close();
    }
}

