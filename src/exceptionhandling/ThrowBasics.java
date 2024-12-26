package exceptionhandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class ThrowBasics {

    // Main method, where execution starts
    public static void main(String[] args) throws IOException, RuntimeException {

        // BufferedReader is used to read user input from the console
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        // Prompt user to enter their age
        System.out.print("Enter your age : ");

        // Read the user's input and convert it to an integer
        int age = Integer.parseInt(bf.readLine());

        // If the age is less than 18, throw a RuntimeException
        if(age < 18){
            // 'throw' keyword is used to explicitly throw an exception
            throw new RuntimeException("Below 18");
        }else{
            // If the age is 18 or more, print a confirmation message
            System.out.println("Good to go!");
        }

        // Close the BufferedReader object to release system resources
        bf.close();
    }
}
