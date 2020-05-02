package NamingPackagesStaticFinal.Final;

public class SIBTest {
    public static final String owner;

    static {
        owner = "tim";
        System.out.println("SIBTEST static initialization block called");
    }

    public SIBTest() {
        System.out.println("SIB constructor called");
    }

    static {
        System.out.println("second initialization called");
    }

    public void someMethod() {
        System.out.println("someMethod called");
    }
}
