package com.bam.contact.service;

import java.util.ArrayList;
import java.util.List;

import com.bam.contact.entity.Contact;

/**
 * Created by ushavetrivel on 6/5/18.
 */
public class ContactServiceTest {



    public static void main(String[] args) {

        ContactServiceImpl contactService = new ContactServiceImpl();
        List<Contact> allContacts = new ArrayList<>();

        Contact contact1 = new Contact.ContactBuilder("Luke", "Skywalker", "01020230320").build();
        allContacts.add(contact1);

        Contact contact2 = new Contact.ContactBuilder("Leia", "Organa", "01020330320").build();
        allContacts.add(contact2);

        contactService.addContacts(allContacts);

        //test adding contacts
        if (contactService.getAllContacts().containsAll(allContacts)) {
            System.out.println("Test passed : All contacts added.");
        }

        //test lookup by firstname, lastname
        if (contactService.getContactsByName("Leia", "Organa").contains(contact2)) {
            System.out.println("Test passed : Contact looked up by first & last name.");
        }

        //test lookup by search term
        if (contactService.search("01020330320").contains(contact2)) {
            System.out.println("Test passed : Contact looked up by searchterm.");
        }

        //test compare if getAllContacts returns all current Contacts.
        if(contactService.getAllContacts().size() == allContacts.size()) {
            System.out.println("Test passed : getAllContacts() returned all current contacts.");
        }
    }
}
