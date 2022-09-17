// Print gender (Male/Female) program according to given M/F using switch.

import java.util.Scanner;
public class MaleFemaleSwitch {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.print("Enter a Character (M/F)  : ");
	        Scanner sc = new Scanner(System.in);
	        char Gender = sc.next().charAt(0);
	        switch (Gender) {
            //The case values must be unique. In case of duplicate value, it renders compile-time error.
            case 'M':
                System.out.println("Gender is Male");
                break;
            case 'F':
                System.out.println("Gender is Female");
                break;

	}

}
}
