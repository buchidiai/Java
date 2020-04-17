package Oop1;

public class VipCustomer {

    private String name;
    private int creditLimit;
    private String email;
    //overloading constructor - 3 different constuctors
    public VipCustomer() {
        this("default name", 0, "default@email.com");
    }

    public VipCustomer(String name, int creditLimit) {
        this(name, creditLimit, "default1@email.com");
    }

    public VipCustomer(String name, int creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
