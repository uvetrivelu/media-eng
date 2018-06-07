package com.bam.contact.service;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import com.bam.contact.entity.Contact;

/**
 * Implementation for ContactService interface to add & lookup contacts.
 */
public class ContactServiceImpl implements ContactService {

    private Set<Contact> contactsCollection = new HashSet<Contact>();

    @Override
    public void addContacts(Collection<Contact> contacts) {
        contactsCollection.addAll(contacts);
    }

    @Override
    public Collection<Contact> getAllContacts() {
        return contactsCollection;
    }

    @Override
    public Collection<Contact> getContactsByName(final String firstName, final String lastName) {
        Set<Contact> filteredByFirstAndLast = contactsCollection.stream()
                .filter( x -> ((x.getFirstName() != null && x.getFirstName().equalsIgnoreCase(firstName)) ||
                        (x.getLastName() != null && x.getLastName().equalsIgnoreCase(lastName))))
                .collect(Collectors.toSet());

        return filteredByFirstAndLast;
    }

    @Override
    public Collection<Contact> search(String searchInput) {
        Set<Contact> filteredByNonNullFields = contactsCollection.stream()
                .filter( x -> (x.getFirstName().contains(searchInput) ||
                        x.getLastName().contains(searchInput) ||
                        x.getPhoneNumber().contains(searchInput)
                ))
                .collect(Collectors.toSet());
        return filteredByNonNullFields;
    }

}
