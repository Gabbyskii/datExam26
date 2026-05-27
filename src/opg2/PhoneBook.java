package opg2;

import java.util.ArrayList;

public class PhoneBook {
    private ArrayList<Contact>contacts;

    public PhoneBook(ArrayList<Contact> contacts) {
        this.contacts = contacts;
    }

    public ArrayList<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(ArrayList<Contact> contacts) {
        this.contacts = contacts;
    }

    public void add(Contact c){
        contacts.add(c);
    }


    public Contact findByName(String name){
        if (name.isEmpty() || name == null){
            throw new IllegalArgumentException("Name can't be empty!");
        }

        for (Contact c: contacts){
            if (c.getName().equalsIgnoreCase(name)){
                System.out.println("Name found: "+ name);
               return c;
            }
        }
       return null;
    }

    public Contact findByPhoneNumber(int phoneNumber){
        if (contacts.isEmpty() || (phoneNumber <= 0)){
            throw new IllegalArgumentException("Phone number not valid!");
        }

        for (Contact c: contacts){
            if (c.getPhoneNumber() == phoneNumber){
                return c;
            }
        }

        return null;
    }

    public Contact removeByName(String name){
        Contact foundName = findByName(name);
        if (foundName != null) {
            contacts.remove(foundName);
            System.out.println("Removed contact: "+ name);
        }

     return foundName;
    }


    public void listAllContacts(){
        System.out.println("==Contact list: "+ contacts.size() meto+"==");
        for (int i = 0; i < contacts.size(); i++){
            System.out.println((i+1) + " - " + contacts.get(i));
        }

    }


    public void findAllByPartialName(String part){
        ArrayList<Contact> parts = new ArrayList<>();

        System.out.println("\nNames with parts '"+ part+"' in it:");
        for (Contact c: contacts){
            if (c.getName().contains(part)){
                parts.add(c);
            }
        }

        for (Contact c : parts){
            System.out.println(c);
        }

    }


    public Contact update(String name, int newNumber) {
        if (name == null || newNumber <= 0) {
            throw new IllegalArgumentException("Contact info invalid!");
        }

        Contact contactName = findByName(name);
        if (contactName != null) {
            contactName.setPhoneNumber(newNumber);
            System.out.println("New number for "+ name + " is: "+ newNumber);
        }
        return contactName;
    }


    @Override
    public String toString() {
        return "PhoneBook: " + contacts;
    }


}
