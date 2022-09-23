
/*
  3Apply private, public, protected and default access modifiers to the constructor
  4. Write constructors with return type int and String
  5. Try to call the constructor multiple times with the same object
*/

public class PublicPrivateProtectedDefault {
    int rollNo;
    String name;
    String clg;
    String city;

    {System.out.println("Student Details");}
    //default access modifier
    PublicPrivateProtectedDefault() {
        this(100);
    }

    //public access modifier
    public PublicPrivateProtectedDefault(int rollNo) {
        this("Shruti");
        this.rollNo = rollNo;
        System.out.println("rollNo : " + rollNo);
    }

    //private access modifiers
    private PublicPrivateProtectedDefault(String name) {
        this("pccs", "pune");
        this.name = name;
        System.out.println("Name : " + name);
    }

    //protected access modifiers
    protected PublicPrivateProtectedDefault(String clg, String city) {
        this.clg = clg;
        this.city = city;
        System.out.println("college : " + clg);
        System.out.println("City : " + city);
    }

    public static void main(String[] args) {
        //calling the constructor multiple times with the same object
        PublicPrivateProtectedDefault c = new PublicPrivateProtectedDefault();
    }
    // NOTE : 4.Constructor looks like method but it is not. It does not have a return type
}