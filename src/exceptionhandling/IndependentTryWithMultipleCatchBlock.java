package exceptionhandling;

public class IndependentTryWithMultipleCatchBlock {
    public static void main(String[] args) {
        // First try-catch block
        try {
            // Definition: Code that may throw exceptions related to string manipulation.
            // Use Case: Attempting to access a character at an invalid index in the string.
            String str = "Let's do something crazy";
            System.out.println(str.charAt(50)); // Throws StringIndexOutOfBoundsException.
        } catch (StringIndexOutOfBoundsException e) {
            // Purpose: Handles invalid string index access specifically.
            System.out.println("Bro, Check out the length of your string once");
        } catch (Exception e) {
            // Purpose: Acts as a fallback to catch any other exception if the specific one above doesn't match.
            System.out.println("I will not execute until StringOutOfBoundException fails or upper block fails");
        }
        // Purpose of this block: Demonstrates multiple catch blocks with specific and generic exception handling.

        // Second try-catch block
        try {
            // Definition: Code that may throw exceptions related to array index access.
            // Use Case: Attempting to access an element at an invalid index in the array.
            String[] strArr = {"Kanxu", "Preeti", "Sonu"};
            System.out.println(strArr[10]); // Throws ArrayIndexOutOfBoundsException.
        } catch (ArrayIndexOutOfBoundsException e) {
            // Purpose: Handles invalid array index access specifically.
            System.out.println("Element you're trying to find doesn't even exist bro!!");
        } catch (Exception e) {
            // Purpose: Acts as a fallback to catch any other exception if the specific one above doesn't match.
            System.out.println("Again I won't execute if upper catch gets execute!!");
        }
        // Purpose of this block: Demonstrates independent try-catch blocks for different operations.

        // Overall Purpose:
        // 1. Demonstrates independent try-catch blocks for modular error handling.
        // 2. Uses multiple catch blocks to prioritize specific exceptions over generic ones.
        // 3. Ensures clear and user-friendly error messages for different exception types.
    }
}