package InnerAbstractClassesInterfaces.Interfaces.phone;

public class MobilePhone implements ITelephone {
    private int myNumber;
    private boolean isRinging;
    private boolean isOn;


    public MobilePhone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        isOn = true;
        System.out.println("Mobile device has powered On");
    }

    @Override
    public void dial(int phoneNumber) {
        if (isOn) {
            System.out.println("Now ringing " + phoneNumber + " on MobilePhone");
        } else {
            System.out.println("Phone is switched off");
        }

    }

    @Override
    public void answer() {
        if (isRinging) {
            System.out.println("Answer the desk phone");
            isRinging = false;

        }

    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if (phoneNumber == myNumber && isOn) {
            isRinging = true;
            System.out.println("La la la ring ring");
        } else {
            isRinging = false;
            System.out.println("Mobile device is not on or powered on");
        }

        return false;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
