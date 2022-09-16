
// Program to equal operator and not equal operators
import java.util.Scanner;
public class Equal_NotEqual {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner num = new Scanner(System.in);
        System.out.print("Enter first number : ");
        
        // "nextInt()" scans the next token of the input as an Int.
        int a = num.nextInt();
        System.out.print("Enter second number : ");
        int b = num.nextInt();
       
        //equal operator (==)
        if (a == b) {
            System.out.println("Both are numbers equal");
        }
        
        //not equal operator (!=)
        else if (a != b) {
            System.out.println("Both are numbers different");
        }
    }


	}


