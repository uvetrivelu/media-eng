package com.bam.contact.entity;

import java.io.Serializable;

/**
 * Contact entity class with equals & hashCode implementation that require
 * lastname, firstname & phonenumber fields to be non-null.
 */
public class Contact implements Serializable {

    private Contact(ContactBuilder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.phoneNumber = builder.phoneNumber;
        this.email = builder.email;
        this.worksAt = builder.worksAt;
        this.notes = builder.notes;
    }

    private String firstName;

    private String lastName;

    private String phoneNumber;

    private String email;

    private String worksAt;

    private String notes;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getWorksAt() {
        return worksAt;
    }

    public String getNotes() {
        return notes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Contact contact = (Contact) o;

        if (!firstName.equals(contact.firstName)) return false;
        if (!lastName.equals(contact.lastName)) return false;
        return phoneNumber.equals(contact.phoneNumber);

    }

    @Override
    public int hashCode() {
        int result = firstName.hashCode();
        result = 31 * result + lastName.hashCode();
        result = 31 * result + phoneNumber.hashCode();
        return result;
    }

    public static class ContactBuilder {

        private String firstName;

        private String lastName;

        private String phoneNumber;

        private String email;

        private String worksAt;

        private String notes;

        public ContactBuilder(String firstName, String lastName, String phoneNumber) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.phoneNumber = phoneNumber;
        }

        public ContactBuilder email(String email) {
            this.email = email;
            return this;
        }

        public ContactBuilder worksAt(String worksAt) {
            this.worksAt = worksAt;
            return this;
        }

        public ContactBuilder notes(String notes) {
            this.notes = notes;
            return this;
        }

        public Contact build() {
            return new Contact(this);
        }

    }
}
