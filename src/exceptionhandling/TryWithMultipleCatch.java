package exceptionhandling;

public class BasicsOfTryCatch {
    public static void main(String[] args) {
        try {
            // Definition: Code that might throw an exception is placed in the try block.
            // Use Case: This code attempts to divide 100 by 0, which is not allowed and will throw an ArithmeticException.
            int x = 100 / 0;
            System.out.println(x); // This line won't execute due to the exception above.
        } catch (ArithmeticException e) {
            // Purpose: This block catches ArithmeticException and handles it gracefully by printing a user-friendly message.
            System.out.println("Arithmetic exception has occurred, please look it once");
        }
        // Overall Purpose: Demonstrates the use of a single catch block to handle specific exceptions.
    }
}