package com.moosya;

public class Main {

    public static void main(String[] args) {

        MobilePhone mobilePhone = new MobilePhone();

        mobilePhone.storeContacts();
        System.out.println("calling showAllContacts...");
        mobilePhone.showAllContacts();
        System.out.println("inserting bergners");
        mobilePhone.storeSpecificContacts(new Contact("moosya", "andrei", 2014522884));


        mobilePhone.showAllContacts();
        mobilePhone.removeContact("moosya");
        mobilePhone.showAllContacts();

    }
}
