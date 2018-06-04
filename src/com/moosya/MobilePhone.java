package com.moosya;

import java.util.*;

public class MobilePhone {

    List<Contact> contacts = new ArrayList<>();

//    Contacts
    public void storeContacts() {


        contacts.add(new Contact("bergners","andrei", 2014522884));
        // if stored properly return location/index
        contacts.add(new Contact("talatini","farouk", 666666666));
    }


    public void storeSpecificContacts(Contact contact) {


        System.out.println("toString " + contact.toString());
        if (findContact(contact.getLastname()) >= 0) {
//        if (findContact(contact)) {
            System.out.println("Record exists - do not insert\n");
        }

        if (findContact(contact) != -1)  {
            System.out.println("Found instance of object " + findContact(contact) + "boo\n");
        }
//        contacts.add(new Contact(lastname, firstname, 1111111111) {

    }

    private int findContact(Contact contact) {
        System.out.println("Entering findContact().  Looking for existence of contact " + contact.toString() + " index: " +
                this.contacts.indexOf(contact));
        System.out.println(Arrays.toString(contacts.toArray()));

        return this.contacts.indexOf("bergners");

    }

    private int findContact(String lastname) {

//        Iterator<Contact> iterator = contacts.iterator();
//        while (iterator.hasNext()) {
        for (Contact temp : this.contacts) {

            if (temp.getLastname().equals(lastname)) {

//                int something = this.contacts.indexOf(lastname);
//                int something = this.contacts.
                System.out.println("contact found " + lastname + "\n");
                return 1;
            } else {
                System.out.println("contact not found " + lastname + "\n");
            }
        }
        return -1;
    }

    public boolean removeContact(String lastname) {

        for (Contact temp : this.contacts) {
            if (lastname.equals(temp.getLastname())) {
                int index = this.contacts.indexOf(temp);;
                System.out.println("Found: " + lastname + " Removing index element: " + index);
                this.contacts.remove(index);
            }
        }
        // if removed correctly
        return true;
    }

    public void showAllContacts() {

        System.out.println("showAllContacts()\n");
        ListIterator listIterator = contacts.listIterator();
        for (ListIterator<Contact> iterator = contacts.listIterator(); iterator.hasNext();) {
            Contact contact = iterator.next();
            System.out.println("\tnext contact " + contact.toString());
        }
    }

}
