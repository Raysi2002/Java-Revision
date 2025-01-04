package filehandeling;

import java.io.File;
import java.nio.file.FileAlreadyExistsException;

public class BasicFolderOperations {
    public static void main(String[] args) {
//        long startTime = System.currentTimeMillis();
////        String path = "/Users/raysi2002/SpringFramework/SpringDataJPA/java-revision/src/filehandeling/testing/test-2";
//        for(int i = 0; i <= 2000; i++){
//            String path = STR."src/filehandeling/testing/test-\{i}";
//            createFolder(path);
//        }
//        long endTime = System.currentTimeMillis();
//        System.out.println((endTime - startTime) );

//        for(int i = 0; i <= 50; i++){
//            String path = STR."/Users/raysi2002/SpringFramework/SpringDataJPA/java-revision/src/filehandeling/testing/test-\{i}";
//            System.out.println(STR."test-\{i} : \{folderExists(path)}");
//        }

//        for(int i = 0; i <= 2000; i++){
//            String path = STR."/Users/raysi2002/SpringFramework/SpringDataJPA/java-revision/src/filehandeling/testing/test-\{i}";
//            System.out.println(STR."test-\{i} : \{deleteFolder(path)}");
//        }

//        String path = STR."/Users/raysi2002/SpringFramework/SpringDataJPA/java-revision/src/filehandeling/testing";
//        System.out.println(deleteFolder(path));

//        String oldPath = STR."src/filehandeling/renamed";
//        String newPath = STR."src/filehandeling/testing";
//        System.out.println(renameFolder(oldPath, newPath));

//        long startTime = System.currentTimeMillis();
//        deleteFolderWithFiles(STR."src/filehandeling/testing");
//        long endTime = System.currentTimeMillis();
//        System.out.println(endTime - startTime);


    }

    static void createFolder(String path){
        try{
            File createFile = new File(path);
            if(!createFile.exists()){
                boolean fileCreated = createFile.mkdir();
                System.out.println(STR."File Created at: \{fileCreated}");
            }else{
                System.out.println("Folder Already Exists !");
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    static boolean folderExists(String path){
        try{
            File fileExists = new File(path);
            return fileExists.exists();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return false;
    }

    static boolean deleteFolder(String path){
        try{
            File deleteFile = new File(path);
            if(deleteFile.exists()){
                return deleteFile.delete();
            }
        }catch(Exception e){
            throw new RuntimeException("Something went wrong!");
        }
        return false;
    }

    static boolean renameFolder(String oldPath, String newPath){
        File oldFile = new File(oldPath);
        File newFile = new File(newPath);
        if(oldFile.exists()){
            return oldFile.renameTo(newFile);
        }else
            return false;
    }



    static void deleteFolderWithFiles(String path){
        try{
            File file = new File(path);
            if(file.exists()){
                for(File f : file.listFiles()){
                    f.delete();
                }
                file.delete();
            }
        }catch (Exception e){
            throw new RuntimeException("Something went wrong in deleteFolderWithFiles method");
        }
    }
}
