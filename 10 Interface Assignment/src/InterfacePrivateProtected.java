
/*
    09. Create a PRIVATE or PROTECTED interface and print the values as above scenario
    10. Create an interface with private, public and protected fields
    11.  Create an interface with static final variable
*/


interface shru_09 {

    public int num1 = 11;
    static final int num2 = 22;
    final int num3 = 33;
    // private int num4 = 44;  - error
    // protected int num5 = 55; - error
}

class InterfacePrivateProtected implements shru_09 {

    public static void main(String[] args) {
        InterfacePrivateProtected if9 = new InterfacePrivateProtected();
        System.out.println(if9.num1 + " " + if9.num2);
    }
}