package Arrays.MobilePhoneChallenge;

import java.util.ArrayList;

public class MobilePhone {
    private String number;
    //created array of contacts from Contact class
    //array methods can be used to query/manipulate the array
    private ArrayList<Contact> myContacts = new ArrayList<Contact>();

    public MobilePhone(String number) {
        this.number = number;
        this.myContacts = myContacts;
    }

    public boolean addNewContact(Contact contact) {
        if (findContact(contact.getName()) >= 0) {
            System.out.println("Contact already exisits.");
            return false;
        }
        myContacts.add(contact);
        return true;
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        int foundPosition = findContact(oldContact);
        if (foundPosition < 0) {
            System.out.println(oldContact.getName() + " does not exist.");
            return false;
        } else if (findContact(newContact.getName()) != -1) {
            System.out.println("Contact with name " + newContact.getName() + " already exists. Update failed");
            return false;
        }

        this.myContacts.set(foundPosition, newContact);
        System.out.println(oldContact.getName() + ", was updated to " + newContact.getName());
        return true;
    }

    public boolean removeContact(Contact contact) {
        int foundPosition = findContact(contact);
        if (foundPosition < 0) {
            System.out.println(contact.getName() + " does not exist.");
            return false;
        }

        this.myContacts.remove(foundPosition);
        System.out.println(contact.getName() + ", was successfully deleted ");
        return true;
    }


    private int findContact(Contact contact) {
        return this.myContacts.indexOf(contact);
    }


    private int findContact(String contactName) {
        for (int i = 0; i < this.myContacts.size(); i++) {
            Contact contact = this.myContacts.get(i);
            if (contact.getName().equals(contactName)) {
                return i;
            }
        }
        return -1;
    }

    public String queryContact(Contact contact) {
        if (findContact(contact) >= 0) {
            return contact.getName();
        }
        return null;
    }

    public Contact queryContact(String name) {
        int position = findContact(name);
        if (position >= 0) {
            return this.myContacts.get(position);
        }
        return null;
    }

    public void printContacts() {
        System.out.println("Contact List..");


        if (this.myContacts.size() <= 0) {
            System.out.println("No contacts saved");
        } else {
            for (int i = 0; i < this.myContacts.size(); i++) {

                System.out.println((i + 1) + ". " + this.myContacts.get(i).getName() + " -> " + this.myContacts.get(i).getNumber());
            }

        }

    }


}
