public class UncommonErrorSolution {
    public static void main(String[] args) {
        try {
            int result = divide(10, 0); // Potential ArithmeticException
            System.out.println("Result: " + result);
        } catch (IllegalArgumentException e) {
            System.err.println("Error: Division by zero is not allowed.");
        } catch (Exception e) {
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    public static int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divisor cannot be zero.");
        }
        return a / b;
    }
} 