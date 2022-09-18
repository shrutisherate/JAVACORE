// Write a program to find the index of an array element
import java.util.*;
public class FindIndex {
	 static void arrIndex(int[] arr, int n) {
	        for (int i = 0; i < arr.length; i++)
	        	 if (n == arr[i]) {
	                 System.out.println(n + " is at index " + i);
	                 return;
	        	 }
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int index;
        //declaring and initializing an array
        int[] arr = {11, 22, 33, 44, 55, 66, 77};
        System.out.println("arr = " + Arrays.toString(arr));
        //user input
        System.out.print("Select any value to find Index of array : ");
        Scanner sc = new Scanner(System.in);
        index = sc.nextByte();
        //passing array and index to method
        arrIndex(arr, index);
    }

	}


