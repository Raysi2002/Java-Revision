package filehandeling;

import java.io.File;
import java.nio.file.FileAlreadyExistsException;

public class Basics {
    public static void main(String[] args) {
        try {
            String filePath = "/Users/raysi2002/SpringFramework/SpringDataJPA/java-revision/src/filehandeling/testing";
            File makeDirectory = new File(filePath);
            if(!makeDirectory.exists()){
                makeDirectory.mkdir();
                System.out.println(STR."File created successfully at: \{filePath}");
            }else{
                System.out.println("File already exists");
            }
        }catch (SecurityException e){
            System.out.println(e.getMessage());
        }
    }
}


// Testing