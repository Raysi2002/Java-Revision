package filehandeling;

import java.io.File;

public class BasicFolderOperations {
    public static void main(String[] args) {
        // Uncomment and use these sections to test folder operations

        // Example: Create multiple folders in a loop
        // long startTime = System.currentTimeMillis();
        // for(int i = 0; i <= 2000; i++){
        //     String path = "src/filehandeling/testing/test-" + i;
        //     createFolder(path);
        // }
        // long endTime = System.currentTimeMillis();
        // System.out.println((endTime - startTime) + " ms");

        // Example: Check if multiple folders exist
        // for(int i = 0; i <= 50; i++){
        //     String path = "src/filehandeling/testing/test-" + i;
        //     System.out.println("test-" + i + " : " + folderExists(path));
        // }

        // Example: Delete multiple folders
        // for(int i = 0; i <= 2000; i++){
        //     String path = "src/filehandeling/testing/test-" + i;
        //     System.out.println("test-" + i + " : " + deleteFolder(path));
        // }

        // Example: Delete a parent folder
        // String path = "src/filehandeling/testing";
        // System.out.println(deleteFolder(path));

        // Example: Rename a folder
        // String oldPath = "src/filehandeling/renamed";
        // String newPath = "src/filehandeling/testing";
        // System.out.println(renameFolder(oldPath, newPath));

//         Example: Delete a folder containing files
         long startTime = System.currentTimeMillis();
         deleteFolderWithFiles("src/filehandeling/testing");
         long endTime = System.currentTimeMillis();
         System.out.println((endTime - startTime) + " ms");
    }

    /**
     * Creates a folder at the specified path.
     * @param path The path where the folder should be created.
     */
    static void createFolder(String path) {
        try {
            File createFile = new File(path);
            if (!createFile.exists()) { // Check if the folder already exists
                boolean fileCreated = createFile.mkdir(); // Create the folder
                System.out.println("File Created at: " + fileCreated);
            } else {
                System.out.println("Folder Already Exists!");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Checks if a folder exists at the specified path.
     * @param path The path to check for folder existence.
     * @return True if the folder exists, false otherwise.
     */
    static boolean folderExists(String path) {
        try {
            File fileExists = new File(path);
            return fileExists.exists(); // Return true if the folder exists
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return false;
    }

    /**
     * Deletes a folder at the specified path.
     * @param path The path of the folder to delete.
     * @return True if the folder was deleted, false otherwise.
     */
    static boolean deleteFolder(String path) {
        try {
            File deleteFile = new File(path);
            if (deleteFile.exists()) { // Check if the folder exists
                return deleteFile.delete(); // Attempt to delete the folder
            }
        } catch (Exception e) {
            throw new RuntimeException("Something went wrong!");
        }
        return false;
    }

    /**
     * Renames a folder from the old path to the new path.
     * @param oldPath The current path of the folder.
     * @param newPath The new path for the folder.
     * @return True if the folder was renamed successfully, false otherwise.
     */
    static boolean renameFolder(String oldPath, String newPath) {
        File oldFile = new File(oldPath);
        File newFile = new File(newPath);
        if (oldFile.exists()) { // Check if the old folder exists
            return oldFile.renameTo(newFile); // Attempt to rename the folder
        } else {
            return false;
        }
    }

    /**
     * Deletes a folder and all its files (non-recursive).
     * @param path The path of the folder to delete.
     */
    static void deleteFolderWithFiles(String path) {
        try {
            File file = new File(path);
            if (file.exists()) { // Check if the folder exists
                for (File f : file.listFiles()) { // Iterate through all files in the folder
                    f.delete(); // Delete each file
                }
                file.delete(); // Delete the empty folder
            }else{
                System.out.println("No such folder exists");
            }
        } catch (Exception e) {
            throw new RuntimeException("Something went wrong in deleteFolderWithFiles method");
        }
    }
}