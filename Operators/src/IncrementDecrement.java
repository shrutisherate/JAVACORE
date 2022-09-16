

// Write a method for increment and decrement operators(++, --)
public class IncrementDecrement {
	 static void preIncrement(int a, int b) {
	        int d;                  //First the value of a is incremented to 21
	        d = b + (++a);          //Then b is added to 21 to get 26
	        System.out.println("Values after Pre-Increment a,b : " + a + "," + d);//a=21,b=26
	    }

	    static void postIncrement(int a, int b) {
	        int d;                  //first the value of a is added to b to get 25
	        d = b + (a++);          //Then after execution, a is incremented to 21
	        System.out.println("Values after Post-Increment a,b : " + a + "," + d);//a=21,b=25
	    }

	    /* Decrement Operator :	--	(--a or a--)
	        It decrements the value of a variable by 1.	*/
	    static void preDecrement(int a, int b) {
	        int d;                  //First the value of a is decremented to 19
	        d = b + (--a);          //Then b is added to 19 to get 24
	        System.out.println("Values after Pre-Decrement a,b : " + a + "," + d);//a=19,b=24
	    }

	    static void postDecrement(int a, int b) {
	        int d;                  //first the value of a is added to b to get 25
	        d = b + (a--);          //Then after execution, a is Decremented to 19
	        System.out.println("Values after Post-Decrement a,b : " + a + "," + d);//a=19,b=25
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int a = 20;
	        int b = 5;
	        preIncrement(a, b);
	        postIncrement(a, b);
	        preDecrement(a, b);
	        postDecrement(a, b);
	}

}
