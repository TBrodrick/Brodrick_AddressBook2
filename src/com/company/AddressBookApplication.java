package com.company;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/*
* @author Tristan Brodrick
* @since 1.2
 */
public class AddressBookApplication {

	public static AddressBook ab;

    public static void main(String[] args) throws FileNotFoundException {
		ab.readFromFile();

		//List Address Book
    	ab.list();
    }

    public static void initAddressBook(){
    	Entry entry1 = new Entry("Tristan", "Brodrick", "25200 Carlos Bee Blvd", "Hayward", "CA", "94542", "(707)239-1512", "tbodrick@horizon.csueastbay.edu");
		Entry entry2 = new Entry();
    	ab.add(entry1);
		ab.add(entry2);
	}

}
