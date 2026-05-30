package opg2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){

        ArrayList<Contact>contactList = new ArrayList<>();
        contactList.add(new Contact("sara", 54321));
        contactList.add(new Contact("didi", 12345));
        contactList.add(new Contact("conrad", 98765));
        contactList.add(new Contact("Sebastian", 0));


        PhoneBook pb = new PhoneBook(contactList);
        System.out.println(pb.findByName("didi"));
        System.out.println(pb.findByName("sara"));
        System.out.println();

        System.out.println(pb.removeByName("didi"));
        System.out.println();

        System.out.println(pb.update("sebastian", 122334));

        System.out.println();
        pb.listAllContacts();

        Contact c = pb.findByName("cameron");
        if (c == null){
            System.out.println("Contact not found..");
        }


    }


}
