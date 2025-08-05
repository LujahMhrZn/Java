package Streams;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileOperationsExample {
    public static void main(String[] args) {
        String filePath = "example.txt";
        File file = new File(filePath);
         
        try
        {
            if(file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.err.println("An error occurred while creating the file: ");
            e.printStackTrace();
        }

        if (file.exists()) {
            System.out.println("File name: " + file.getName());
            System.out.println("File exists: " + file.getAbsolutePath());
            System.out.println("File writable: " + file.canWrite());
            System.out.println("File readable: " + file.canRead());
            System.out.println("File size in bytes: " + file.length());
            System.out.println("File last modified: " + new java.util.Date(file.lastModified()));
        } else {
            System.out.println("File does not exist.");
        }
        try(FileWriter write = new  FileWriter(filePath)){
            write.write("Hello my friend.");
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.err.println("An error occurred while writing to the file: ");
            e.printStackTrace();
        }

        try(BufferedReader reader = new BufferedReader(new java.io.FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("An error occurred while reading the file: ");
            e.printStackTrace();

        }
        // if(file.delete()){
        //     System.out.println("Deleted file: " + file.getName());
        //         }else{
        //     System.out.println("Failed to delete the file.");
        //         }
    }
}
// This code demonstrates basic file operations in Java, including creating a file, writing to it, and reading from it.
// It also checks if the file exists and prints its properties such as name, path, writable status, readable status, size, and last modified date.