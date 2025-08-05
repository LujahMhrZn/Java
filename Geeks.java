// Java Program to Illustrate Un-checked Exceptions

import java.io.FileNotFoundException;
import java.io.FileReader;

class Geeks {
    public static void main(String args[]) {
      
       try{
        FileReader fr = new FileReader("test.txt");
       }catch(FileNotFoundException e){
        System.out.println("File not found: " + e.getMessage());
       }

        int x = 0;
        int y = 10;
        int z = y / x;
    }
}