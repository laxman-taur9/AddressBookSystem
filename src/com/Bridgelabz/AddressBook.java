package com.Bridgelabz;

import java.util.Scanner;

public class AddressBook {

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
}
