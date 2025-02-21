public class UncommonErrorExample {
    public static void main(String[] args) {
        try {
            int result = 10 / 0; // Potential ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.err.println("Exception caught: " + e.getMessage());
        } finally {
            // Resource cleanup here
            System.out.println("Finally block executed");
        }
        // Dead code. It will never be reached if an exception occurs
        System.out.println("This line should be unreachable if exception happens");

        String str = null;
        // NullPointerException
        System.out.println(str.length());
    }
}