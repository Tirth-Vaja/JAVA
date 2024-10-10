import java.util.Scanner;

public class pr24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            // Taking two integer inputs from the user
            System.out.println("Enter integer x: ");
            int x = Integer.parseInt(scanner.nextLine());  // Converting input to integer
            
            System.out.println("Enter integer y: ");
            int y = Integer.parseInt(scanner.nextLine());  // Converting input to integer
            
            // Performing division
            int result = x / y;
            System.out.println("Result of " + x + " / " + y + " is: " + result);
        
        } catch (NumberFormatException e) {
            // Catching non-integer input exception
            System.out.println("Error: Please enter valid integers.");
        
        } catch (ArithmeticException e) {
            // Catching division by zero exception
            System.out.println("Error: Division by zero is not allowed.");
        
        } finally {
            // Closing the scanner resource
            scanner.close();
        }
        
        System.out.println("Program finished.");
    }
}
