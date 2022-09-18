
// Write a function to find the minimum and maximum value of an array
 


import java.util.Arrays;

public class MinMaxValue {
    
    static int minValue(int[] arr) {
        //int result = arr[0];
        int min = arr[0];
        //for each loop
        for (int j : arr)
            if (j < min)
                min = j;
        return min;
    }
    
    static int maxValue(int[] arr) {
        // int result = arr[0];
        int max = arr[0];
        //for each loop
        for (int j : arr)
            if (j > max)
                max = j;
        return max;
    }

    public static void main(String[] args) {
        //declaring and initializing an array
        int[] my_arr = {11, 22, 33, 44, 55, 66};
        //printing array as string
        System.out.println("my_arr = " + Arrays.toString(my_arr));
        //passing array to method to get maximum value
        System.out.println("The Maximum value = " + maxValue(my_arr));
        //passing array to method to get minimum value
        System.out.println("The Minimum value = " + minValue(my_arr));
    }
}
