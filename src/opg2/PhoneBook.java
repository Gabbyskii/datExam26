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
        if (contacts.isEmpty()) {
            throw new IllegalArgumentException("Phone book is empty!");
        }

        for (Contact c: contacts){
            if (c.getName().equalsIgnoreCase(name)){
                System.out.println("Name found: "+ name);
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
        System.out.println("==Contact list: "+ contacts.size()+"==");
        for (int i = 0; i < contacts.size(); i++){
            System.out.println((i+1) + " - " + contacts.get(i));
        }

    }


    public Contact update(String name, int newNumber) {
        if (name == null || newNumber <=0){
            throw new IllegalArgumentException("Invalid contact info!");
        }

       Contact newContact = findByName(name);
       if (newContact != null){
           newContact.setPhoneNumber(newNumber);
           System.out.println("New number for "+ name +" is updated to: "+ newNumber);

       }
       return newContact;

    }


    @Override
    public String toString() {
        return "PhoneBook: " + contacts;
    }


}
