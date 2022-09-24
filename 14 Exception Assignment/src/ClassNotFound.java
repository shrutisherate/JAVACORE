
// 10.Write a program to generate ClassNotFoundException

public class ClassNotFound {

    public static void main(String[] args) {

        try {
            Class.forName("com.exceptions.jala");
            ClassLoader.getSystemClassLoader().loadClass("com.exceptions.jala");

        } catch (ClassNotFoundException e) {
            
            e.printStackTrace();
        }
    }
}