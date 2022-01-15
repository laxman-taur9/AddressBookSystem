package com.Bridgelabz;

import java.util.Scanner;
import java.util.ArrayList;

public class AddressBook {

	ArrayList<Contacts> contactList = new ArrayList<>();
	private Scanner scanner=new Scanner(System.in);
	public Contacts addContacts() {
		
		Contacts contacts = new Contacts();
		
		System.out.println("Enter FirstName");
		String firstName=scanner.nextLine();
		System.out.println("Enter LastName");
		String lastName=scanner.nextLine();
		System.out.println("Enter Address");
		String address=scanner.nextLine();
		System.out.println("Enter City");
		String city=scanner.nextLine();
		System.out.println("Enter Email");
		String email=scanner.nextLine();
		System.out.println("Enter State");
		String state=scanner.nextLine();
		System.out.println("Enter Zip");
		String zip=scanner.nextLine();
		System.out.println("Enter MobileNo");
		String mobileNo=scanner.nextLine();

		contacts.setFirstName(firstName);
		contacts.setLastName(lastName);
		contacts.setAddress(address);
		contacts.setCity(city);
		contacts.setEmail(email);
		contacts.setState(state);
		contacts.setZip(zip);
		contacts.setMobileNo(mobileNo);
		
		
		return contacts;
		
	}
	
	public void showContacts(Contacts contacts) {
		
		System.out.println("First Name "+contacts.getFirstName());
		System.out.println("Last Name "+contacts.getLastName());
		System.out.println("Address "+contacts.getAddress());
		System.out.println("City "+contacts.getCity());
		System.out.println("Email "+contacts.getEmail());
		System.out.println("State "+contacts.getState());
		System.out.println("Zip Code "+contacts.getZip());
		System.out.println("Mobile No "+contacts.getMobileNo());
		
	}
//Method to Edit the Exisitng Contact
	public void editContact() {
		//Get First name to Edit the Contact
		System.out.println("Enter the First Name :");
		String firstName = scanner.next();
		
		//check if the given User with First name
		boolean isAvailable = false;
		for(Contacts contact : contactList) {
		if(firstName.equalsIgnoreCase(contact.getFirstName())) {
			isAvailable = true;
			System.out.println("Enter the Last Name:");
			contact.setLastName(scanner.next());
			System.out.println("Enter the Address:");
			contact.setAddress(scanner.next());
			System.out.println("Enter the City:");
			contact.setCity(scanner.next());
			System.out.println("Enter the State");
			contact.setState(scanner.next());
			System.out.println("Enter the Zip Code:");
			contact.setZip(scanner.next());
			System.out.println("Enter the phone number:");
			contact.setMobileNo(scanner.next());
			System.out.println("Enter Email id:");
			contact.setEmail(scanner.next());
			
		}
	}
      if(!isAvailable) {
    	  System.out.println("Contact Number Not Found.");
      }

	}
	
	// Method to Delete the Existing contact
	public void deleteContact() {
		//Get first Name to Edit the contact
		System.out.println("Enter The first Name:");
		String firstName = scanner.next();
		
		//check if the Given User with First Name
		boolean isAvailable = false;
		for(Contacts contact : contactList) {
			if(firstName.equalsIgnoreCase(contact.getFirstName()));
			isAvailable=true;
			contactList.remove(contact);
			System.out.println("Contact Deleted.");
			break;
			
		}
	
	if(!isAvailable) {
		System.out.println("Contact Number Not Found.");
	}
}
}




