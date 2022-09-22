
/*
05. Create two interfaces with the same method (same signature) in both the interfaces.
  Implement these two interfaces in one class. Call the method.
*/

//interface 1
interface shru_5 {
    void sameMethod();
}

//interface 2
interface shru_05 {
    void sameMethod();
}

//Implemented these two interfaces in one class
class TwoInterfaceSameMethod implements shru_5, shru_05 {
    
    public void sameMethod() {
        System.out.println("This is same method in both the interfaces");
    }

    //main method
    public static void main(String[] args) {
        TwoInterfaceSameMethod if5 = new TwoInterfaceSameMethod();
        if5.sameMethod();
    }
}