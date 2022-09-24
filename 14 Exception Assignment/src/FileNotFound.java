
// 11.Write a program to generate FileNotFoundException

import java.io.*;
public class FileNotFound {
    public static void main(String[] args) {

        try {
            // create instance of the BufferedReader and pass the FileReader instance to it.
            BufferedReader reader = new BufferedReader(new FileReader(new File("/invalid/file/location")));
        }
        //FileNotFoundException is a subclass of IOException.
        catch (FileNotFoundException e) {
            System.err.println("FileNotFoundException caught!");
            
            e.printStackTrace();
        }
    }
}