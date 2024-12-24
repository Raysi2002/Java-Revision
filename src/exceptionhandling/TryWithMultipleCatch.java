package exceptionhandling;

public class TryWithMultipleCatch {
    public static void main(String[] args) {
        try {
            // Definition: The try block contains code that might throw multiple types of exceptions.
            // Use Case: Accessing an invalid index in an array.
            int[] arr = {1, 2, 3, 4, 5};
            System.out.println(arr[6]); // Throws ArrayIndexOutOfBoundsException.

            // Use Case: Accessing an invalid character index in a string.
            String str = "Hey Bae....";
            System.out.println(str.charAt(15)); // Throws StringIndexOutOfBoundsException.
        } catch (ArrayIndexOutOfBoundsException e) {
            // Purpose: Handles scenarios where the program tries to access an array index that does not exist.
            System.out.println("Array index is out of bound");
        } catch (StringIndexOutOfBoundsException e) {
            // Purpose: Handles scenarios where the program tries to access a string character index that does not exist.
            System.out.println("Character is out of index");
        }
        // Overall Purpose: Demonstrates the use of multiple catch blocks to handle different types of exceptions specifically.
    }
}