package com.bam.contact.service;

import java.util.Collection;

import com.bam.contact.entity.Contact;

/**
 * Service to create & query contacts by name & search term.
 */
public interface ContactService {

    /**
     * Adds contacts to existing to list of existing contacts.
     * @param contacts
     */
    public void addContacts( Collection<Contact> contacts );

    /**
     * Returns all contacts.
     * @return
     */
    public Collection<Contact> getAllContacts();

    /**
     * Filters contacts by firstname & lastName. Method can return empty list for non-matching firstname, lastname combination.
     * @param firstName
     * @param lastName
     * @return
     */
    public Collection<Contact> getContactsByName( String firstName, String lastName );

    /**
     * Filters contacts by given search term & can return zero list of matched contacts.
     * @param searchInput
     * @return
     */
    public Collection<Contact> search( String searchInput );

}
