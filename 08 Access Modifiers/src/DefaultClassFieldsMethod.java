
/*
 Create a class with DEFAULT fields and methods. Access these fields and methods
  from any other class in the same package
  */

class DefaultClass_02 {
    //Default fields
    int myAge;
    String myName;

    //Default method
    void defaultMethod() {
        System.out.println("My name is " + myName + " and my age is " + myAge);
    }
}

//Accessing default fields and method from other class in the same package
public class DefaultClassFieldsMethod {
    public static void main(String[] args) {
        //Creating object of DefaultClass_02.
        DefaultClass_02 obj = new DefaultClass_02();
        //Accessing default fields
        obj.myAge = 23;
        obj.myName = "Shruti";
        //calling default method
        obj.defaultMethod();
    }
}