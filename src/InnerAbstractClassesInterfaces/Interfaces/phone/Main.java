package InnerAbstractClassesInterfaces.Interfaces.phone;

public class Main {

    public static void main(String[] args) {
        //have to instantiate as so
        //so we don't override the methods
        ITelephone timsPhone;

        timsPhone = new DeskPhone(976456987);

        timsPhone.powerOn();
        timsPhone.callPhone(976456987);
        timsPhone.dial(1234567);



        timsPhone = new MobilePhone(1243535);

        timsPhone.powerOn();
        timsPhone.callPhone(24354);
        timsPhone.answer();
    }
}
