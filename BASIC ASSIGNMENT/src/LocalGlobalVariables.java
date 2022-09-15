
public class LocalGlobalVariables {
	
	 // Instance variable is declared inside the class but outside the body of the method.
    int a = 100;
    void localVariable() {
       
    	//Local variables are declared in methods, constructors, or blocks.
        int a = 200;
        System.out.println("Local variable a : " + a);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 LocalGlobalVariables obj = new LocalGlobalVariables();
	        System.out.println("Instance variable a : " + obj.a);
	       
	        //calling method()
	        obj.localVariable();

	}

}
