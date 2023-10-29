import java.util.InputMismatchException;
import java.util.Scanner;

public class Integer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            int number = input.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Wrong input. It must be an integer.");
        }
    }
}
