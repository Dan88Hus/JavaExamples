import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        try {
            System.out.println("Enter a whole number to divide");
            int x = scanner.nextInt();
            System.out.println("Enter a whole number to divede by: ");
            int y = scanner.nextInt();
            int z = x / y;
            System.out.println("x/y: " + z);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException has been occured " + e);
        } catch (Exception e) {
            System.out.println("Exception has been occured " + e);
        }
        finally {
            System.out.println("this will always works finally");
            scanner.close();
        }
    }
}
