package com.Bridgelabz;

public class AddressBookMain {

	public static void main(String[] args) {
		int choice;
		AddressBook addressBook = new AddressBook();
		Contacts contacts = addressBook.addContacts();
		addressBook.showContacts(contacts);
		addressBook.editContact();
		addressBook.deleteContact();
		
		do {
            System.out.println("Address Book System");
            System.out.println("1. Add New Contact\n2. Show Contact\n3. Edit contact\n4. Delete contact\n5. Exit");
            System.out.println("select Any Number");
            choice=addressBook.scanner.nextInt();
            
            switch(choice) {
            case 1:
            	addressBook.addContacts();
            	break;
            case 2:
            	addressBook.showContacts(contacts);
            	break;
            case 3:
            	addressBook.editContact();
            	break;
            case 4:
            	addressBook.deleteContact();
            	break;
            case 5:
            	System.out.println("Address Book.");
            	break;
            	default:
            		System.out.println("select the Number between 1 to 3");
            		break;
            }
		}while(choice!=3);
	}
}
