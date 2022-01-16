package com.Bridgelabz;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AddressBook1 {

	    static Map<String, AddressBook> addressBookMap = new HashMap<>();

	    static Scanner scanner = new Scanner(System.in);

	    public static void addNewAddressBook() {
	        System.out.println("Enter the Address Book Name :");
	        String addressbookName = scanner.next();
	        if(checkAddressBook(addressbookName)) {
	            System.out.println("Entered AddressBook is Already Available");
	        } else {
	            AddressBook addressBook = new AddressBook();
	            addressBookMap.put(addressbookName,addressBook);
	        }
	    }

	    public static void displayAddressBooks() {
	        for(String key: addressBookMap.keySet()){
	            System.out.println(key);
	        }
	    }

	    public static boolean checkAddressBook(String addressbookName) {
	        for(String key: addressBookMap.keySet()){
	            if(addressbookName.equalsIgnoreCase(key)) {
	                return true;
	            }
	        }
	        return false;
	    }

	    public static void selectAddressBook() {
	        displayAddressBooks();
	        System.out.println("Enter the Address Book Name :");
	        String addressbookName = scanner.next();
	        if(checkAddressBook(addressbookName)) {
	            addressBookMap.get(addressbookName).contactOptions(addressBookMap.get(AddressBook));
	        } else {
	            System.out.println("Entered Address Book Name is Invalid");
	        }
	    }

	    public static void editAddressBook() {
	        displayAddressBooks();
	        System.out.println("Enter the Address Book Name :");
	        String addressbookName = scanner.next();
	        if(checkAddressBook(addressbookName)) {
//	            System.out.println("Enter the New Name for AddressBook :");
//	            String newName = sc.next();
//	            addressBookMap.;
	        } else {
	            System.out.println("Entered Address Book Name is Invalid");
	        }
	    }

	    public static void deleteAddressBook() {
	        displayAddressBooks();
	        System.out.println("Enter the Address Book Name :");
	        String addressbookName = scanner.next();
	        if(checkAddressBook(addressbookName)) {
	            addressBookMap.remove(addressbookName);
	            System.out.println("Address Book is Deleted");
	        } else {
	            System.out.println("Entered Address Book Name is Invalid");
	        }
	    }

	    public static final int userInput() {
	        return scanner.nextInt();
	    }
	}


