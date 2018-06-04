package com.moosya;

public class Contact {
    private String lastname;
    private String firstname;
    private int phone;


    public Contact(String lastname, String firstname, int phone) {
        this.lastname = lastname;
        this.firstname = firstname;
        this.phone = phone;
    }

    public String getLastname() {
        return lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public int getPhone() {
        return phone;
    }

    public static Contact addContact(String lastname, String firstname, int phone) {

        return new Contact(lastname, firstname, phone);
    }

    @Override
    public String toString() {
        return "Contact{" +
                "lastname='" + lastname + '\'' +
                ", firstname='" + firstname + '\'' +
                ", phone=" + phone +
                '}';
    }
}
