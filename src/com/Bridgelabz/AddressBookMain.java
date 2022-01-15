package com.Bridgelabz;

public class AddressBookMain {

	public static void main(String[] args) {
		AddressBook addressBook = new AddressBook();
		Contacts contacts = addressBook.addContacts();
		addressBook.showContacts(contacts);
		addressBook.editContact();
		addressBook.deleteContact();
	}
}
