package Arrays.MobilePhoneChallenge;

import java.util.Scanner;

// Create a program that implements a simple mobile phone with the following capabilities.
// Able to store, modify, remove and query contact names.
// You will want to create a separate class for Contacts (name and phone number).
// Create a master class (MobilePhone) that holds the ArrayList of Contacts
// The MobilePhone class has the functionality listed above.
// Add a menu of options that are available.
// Options:  Quit, print list of contacts, add new contact, update existing contact, remove contact
// and search/find contact.
// When adding or updating be sure to check if the contact already exists (use name)
// Be sure not to expose the inner workings of the Arraylist to MobilePhone
// e.g. no ints, no .get(i) etc
// MobilePhone should do everything with Contact objects only.
public class Main {

    private static Scanner scanner = new Scanner(System.in);
    //create new mobilePhone object to access its functionality
    private static MobilePhone mobilePhone = new MobilePhone("468 245 9876");

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;

        startDevice();
        showOptions();

        while (!quit) {
            System.out.println("Enter your choice: choose from 0 - 6 ");

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    showOptions();
                    break;
                case 1:
                    printContacts();
                    break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    deleteContact();
                    break;
                case 5:
                    findContact();
                    break;
                case 6:
                    System.out.println("Shutting down phone");
                    quit = true;
                    break;


            }


        }
        showOptions();
    }

    private static void findContact() {
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        //query for the contact name from mobilePhone class
        Contact existingContact = mobilePhone.queryContact(name);
        //return if name was not found in array
        if (existingContact == null) {
            System.out.println("Contact was not found");
            return;
        }
        System.out.println("Contact found");
        System.out.println("Name = " + existingContact.getName());
        System.out.println("Phone number = " + existingContact.getNumber());

    }

    private static void deleteContact() {
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        //query for the contact name from mobilePhone class
        Contact existingContact = mobilePhone.queryContact(name);
        //return if name was not found in array
        if (existingContact == null) {
            System.out.println("Contact was not found");
            return;
        }

        if (mobilePhone.removeContact(existingContact)) {

            System.out.println("Contact deleted successfully");
        } else {
            System.out.println("Contact deleting failed.");
        }
    }

    private static void addNewContact() {
        System.out.println("Enter new contact name: ");
        String name = scanner.nextLine();
        System.out.println("Enter phone number: ");
        String input = scanner.nextLine();
        String number = input.replaceFirst("(\\d{3})(\\d{3})(\\d+)", "($1) $2-$3");

        //contact class method is called to create new object with name and number
        Contact newContact = Contact.createContact(name, number);
        //try to save new contact to mobile phone
        if (mobilePhone.addNewContact(newContact)) {
            System.out.println(name + "'s contact info was successfully saved to your mobile device.");
        } else {
            System.out.println("Duplicate found, " + name + " already exists.");
        }

    }

    private static void updateContact() {
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        //query for the contact name from mobilePhone class
        Contact existingContact = mobilePhone.queryContact(name);
        //return if name was not found in array
        if (existingContact == null) {
            System.out.println("Contact was not found");
            return;
        }
        //get new info
        System.out.println("Enter new name: ");
        String newName = scanner.nextLine();
        System.out.println("Enter new phone number: ");
        String input = scanner.nextLine();
        String newNumber = input.replaceFirst("(\\d{3})(\\d{3})(\\d+)", "($1) $2-$3");

        //create a new contact object
        Contact newContact = Contact.createContact(newName, newNumber);

        // update and check if update was successful
        if (mobilePhone.updateContact(existingContact, newContact)) {
            System.out.println("Contact updated successfully");
        } else {
            System.out.println("Contact update failed.");
        }

    }

    private static void startDevice() {
        System.out.println("Starting device....");
    }

    private static void printContacts() {
        mobilePhone.printContacts();
    }

    public static void showOptions() {
        System.out.println("\nManage your phone:  ");
        System.out.println("\t 0 - Show mobile options.");
        System.out.println("\t 1 - Print all contacts.");
        System.out.println("\t 2 - Add new contact.");
        System.out.println("\t 3 - Update existing contact.");
        System.out.println("\t 4 - Delete contact.");
        System.out.println("\t 5 - Find contact.");
        System.out.println("\t 6 - Shutdown.");

    }


}
