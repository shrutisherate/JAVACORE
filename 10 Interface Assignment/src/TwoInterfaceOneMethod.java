
 /*
04.Create two interfaces with one method each. Implement these two interfaces in one
class.
*/

//interface 1
interface shru_4 {
    void methodOne();
}

//interface 2
interface shru_04 {
    void methodTwo();
}

//Implemented these two interfaces in one class
public class TwoInterfaceOneMethod implements shru_4, shru_04 {
   
    public void methodOne() {
        System.out.println("This is Method one");
    }

    
    public void methodTwo() {
        System.out.println("This is Method two");
    }

    //main method
    public static void main(String[] args) {
        TwoInterfaceOneMethod if4 = new TwoInterfaceOneMethod();
        //Calling the methods implemented
        if4.methodOne();
        if4.methodTwo();
    }
}