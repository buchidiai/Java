package NamingPackagesStaticFinal.Final;

public class ExtendedPassword extends Password {

    private int decryptPassword;

    public ExtendedPassword(int password) {
        super(password);
        this.decryptPassword = decryptPassword;
    }
    //cant be overridden because of final keyword used in parent method


//    @Override
//    public void storePassword() {
//        System.out.println("Saving password as " + this.decryptPassword);
//    }
}
