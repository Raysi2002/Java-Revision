package exceptionhandling;

public class MultipleTryCatchBlock {
    public static void main(String[] args) {
        // First try-catch block
        try {
            // Definition: Code that may throw an exception is placed inside the try block.
            // Use Case: Accessing an invalid index in an array.
            int[] arr = {2, 4, 9, 1};
            System.out.println(arr[10]); // This will throw ArrayIndexOutOfBoundsException.
        } catch (ArrayIndexOutOfBoundsException e) {
            // Purpose: Handles the exception caused by accessing an invalid array index.
            System.out.println("Array is out of index. Please check it out once");
        }
        // Purpose of this block: To handle array-related exceptions without affecting other parts of the program.

        // Second try-catch block
        try {
            // Use Case: Accessing an invalid character index in a string.
            String str = "I am revising Exception handling";
            System.out.println(str.charAt(50)); // This will throw StringIndexOutOfBoundsException.
        } catch (StringIndexOutOfBoundsException e) {
            // Purpose: Handles the exception caused by accessing an invalid string character index.
            System.out.println("Index is out of bound");
        }
        // Purpose of this block: To handle string-related exceptions separately.

        // Overall Purpose:
        // This program demonstrates the use of multiple independent try-catch blocks.
        // Each block handles exceptions for specific operations, ensuring modular and clear error handling.
    }
}