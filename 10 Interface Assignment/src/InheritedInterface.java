
/*
07. Create an interface and inherit it from the other interface.
*/

//interface
interface shru_7 {
    void methodOne();
}

//inherited interface
interface shru_07 extends shru_7 {
    void methodTwo();
}

class InheritedInterface implements shru_07 {
    //override method of interface Jala_7
    
    public void methodOne() {
        System.out.println("This is first method");
    }
    //override method of inherited interface Jala_07
    
    public void methodTwo() {
        System.out.println("This is second method");
    }

    public static void main(String[] args) {
        //creating obj of InheritedInterface
        InheritedInterface if7 = new InheritedInterface();
        //Calling the methods implemented
        if7.methodOne();
        if7.methodTwo();
    }
}