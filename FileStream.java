import java.io.*;

public class FileStream {
    public static void main(String[] args) {
        // Example of reading from a file and writing to another file
   
    try(FileInputStream fis = new FileInputStream("from.txt");
        FileOutputStream fos = new FileOutputStream("to.txt");) {
            byte[] buffer = new byte[1024];
            int c;
            while ((c = fis.read(buffer)) != -1) {
                fos.write(buffer,0,c);
            }
            System.out.println("File copied successfully.");
    } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
    }   
}
}
