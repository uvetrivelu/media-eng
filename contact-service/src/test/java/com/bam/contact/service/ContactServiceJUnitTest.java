package com.bam.contact.service;

import java.util.HashSet;
import java.util.Set;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import com.bam.contact.entity.Contact;

/**
 * Tests to verify ContactService methods with positive assertions only.
 */

public class ContactServiceJUnitTest {

    ContactServiceImpl contactService = new ContactServiceImpl();
    Set<Contact> allContacts = new HashSet<>();
    @Before
    public void init() {
        Contact contact1 = new Contact.ContactBuilder("Luke", "Skywalker", "01020230320").build();
        allContacts.add(contact1);

        Contact contact2 = new Contact.ContactBuilder("Leia", "Organa", "01020330320").build();
        allContacts.add(contact2);

        contactService.addContacts(allContacts);

    }

    @Test
    public void testAddContacts() {

        //test adding contacts
        Assert.assertTrue(contactService.getAllContacts().containsAll(allContacts));

    }

    @Test
    public void testSearchByName() {

        Contact contact2 = new Contact.ContactBuilder("Leia", "Organa", "01020330320").build();

        //test lookup by firstname, lastname
        Assert.assertTrue(contactService.getContactsByName("Leia", "Organa").contains(contact2));

    }


    @Test
    public void testSearchByFirstName() {

        Contact contact2 = new Contact.ContactBuilder("Leia", "Organa", "01020330320").build();

        Contact contact3 = new Contact.ContactBuilder("Leia", "Princess", "01020330320").build();
        allContacts.add(contact3);

        //test lookup by firstname, lastname
        Set<Contact> result = new HashSet<>();
        result = (Set) contactService.getContactsByName("Leia", "Organa");
        Assert.assertTrue(result.contains(contact2));
        Assert.assertTrue(result.contains(contact3));

    }

    @Test
    public void testSearchByPhone() {

        Contact contact2 = new Contact.ContactBuilder("Leia", "Organa", "01020330320").build();

        //test lookup by search term
        Assert.assertTrue(contactService.search("01020330320").contains(contact2));

    }

    @Test
    public void testNumberOfContacts() {

        //test compare if getAllContacts returns all current Contacts.
        Assert.assertTrue(contactService.getAllContacts().size() == allContacts.size());

    }
}
