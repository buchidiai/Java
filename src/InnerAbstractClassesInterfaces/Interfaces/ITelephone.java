package InnerAbstractClassesInterfaces.Interfaces;

public interface ITelephone {
    //start with an I to denote its an interface
    //define methods that are going to be used but don't actually defining them.

    void powerOn();

    void dial(int phoneNumber);

    void answer();

    boolean callPhone(int phoneNumber);

    boolean isRinging();
}
