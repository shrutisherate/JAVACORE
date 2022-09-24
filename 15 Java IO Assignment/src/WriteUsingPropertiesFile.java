
 // 10.Write a program to write data to properties file

import java.io.FileOutputStream;
import java.util.Properties;

public class WriteUsingPropertiesFile {
    public static void main(String args[]) {

        try {
            //Instantiating the properties file
            Properties props = new Properties();
            //Populating the properties file
            props.put("Name", "Shruti");
            props.put("E.no", "100");
            props.put("College", "pcccs");

            //Instantiating the FileInputStream for output file
            FileOutputStream outputStrem = new FileOutputStream("pf.txt");
            //Storing the properties file
            props.store(outputStrem, "This is a sample properties file");
            System.out.println("Properties file created");

        } catch (Exception e) {
            
            e.printStackTrace();
        }
    }
}
