public class pr25 {
    public static void main(String[] args) {
        try {
            int result = divide(10, 0); 
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        System.out.println("Program continues after the exception is handled.");
    }

    public static int divide(int numerator, int denominator) {
        if (denominator == 0) {
            throw new ArithmeticException("Cannot divide by zero!"); 
        }
        return numerator / denominator;
    }
}
