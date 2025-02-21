public class UncommonErrorSolution {
    public static void main(String[] args) {
        try {
            int result = 10 / 0; // Potential ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.err.println("Exception caught: Division by zero: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed");
        }

        String str = "Hello";
        if (str != null) {
            System.out.println(str.length());
        } else {
            System.out.println("String is null");
        }
    }
} 