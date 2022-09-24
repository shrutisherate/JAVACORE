
//  4.Write text to a .txt file using BufferedOutputStream

import java.io.*;

public class WriteUsingBufferedOutputStream {

    public static void main(String[] args) {
        String s = "This text is written using BufferedOutputStream.";

        try {
            // BufferedOutputStream is a subclass of OutputStream
            //file path passed as parameter to the FileOutputStream constructor.
            FileOutputStream fos = new FileOutputStream("bos.txt");
            //the internal buffer has the default size of 8192 bytes.
            BufferedOutputStream bos = new BufferedOutputStream(fos);

            byte[] arr = s.getBytes();
            // write() method writes data to the output stream
            bos.write(arr);
            //closing streams
            bos.close();
            fos.close();
            System.out.println("Data is written to the file.");

        } catch (Exception e) {
            
            e.printStackTrace();
        }
    }
}