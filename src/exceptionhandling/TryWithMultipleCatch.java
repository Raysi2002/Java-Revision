package exceptionhandling;

public class TryWithMultipleCatch {
    public static void main(String[] args) {
        try{
            int[] arr = {1, 2, 3, 4, 5};
            System.out.println(arr[6]);
            String str = "Hey Bae....";
            System.out.println(str.charAt(15));
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array index is out of bound");
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("Character is out of index");
        }
    }
}
