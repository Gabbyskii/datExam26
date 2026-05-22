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
               return c;
            }
        }

        return null;
    }


    @Override
    public String toString() {
        return "PhoneBook: " + contacts;
    }


}
