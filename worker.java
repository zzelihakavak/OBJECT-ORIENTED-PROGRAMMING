import java.util.Scanner;

public class worker {
    private String name;
    private float salary;
    public static int counter;

    public worker() {
        counter++;
    }

    public void setName() {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Please enter worker name: ");
        this.name = scanner.next();
    }

    public void setSalary(float salary) {
        if (salary < 0) {
            throw new IllegalArgumentException("Salary amount must be greater than zero");
        }
        this.salary = salary;
    }

    public float getSalary() {
        return salary;
    }
}