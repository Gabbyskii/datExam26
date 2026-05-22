package opg2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){

        ArrayList<Contact>contactList = new ArrayList<>();
        contactList.add(new Contact("sara", 54321));
        contactList.add(new Contact("didi", 12345));
        contactList.add(new Contact("conrad", 98765));

        PhoneBook pb = new PhoneBook(contactList);
        System.out.println(pb.findByName("didi"));
        System.out.println(pb.findByName("cameron"));
        System.out.println(pb.findByName("sara"));
        System.out.println(pb.findByName("conrad"));


    }


}
