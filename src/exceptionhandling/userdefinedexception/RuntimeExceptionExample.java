package exceptionhandling.userdefinedexception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RuntimeExceptionExample {
    private final String name;
    public RuntimeExceptionExample(String name){
        this.name = name;
    }
    public static void main(String[] args)  {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter age: ");
        byte age = -1;
        try{
            age = Byte.parseByte(bf.readLine());
        }catch (IOException e){
            e.printStackTrace();
        }
        if(age < 18){
            throw new InvalidAgeException();
        }else{
            System.out.println("Welcome to XNXX.COM");
        }
    }
}

class InvalidAgeException extends RuntimeException{
    public InvalidAgeException(){
        System.out.println("Age below 18 aren't allowed !");
    }
    public InvalidAgeException(String message){
        super(message);
    }
}