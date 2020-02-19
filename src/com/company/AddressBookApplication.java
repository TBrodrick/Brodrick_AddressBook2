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

    public static void main(String[] args) {
		//Read file name
		System.out.println("Enter the name of the file you wish to read from:\n");
		Scanner in = new Scanner(System.in);
		String fileName = in.nextLine();

		//Try to access file. test: C:/Users/trist/IdeaProjects/AddressBookApp/src/com/company/testIn.txt
		try {
			init(fileName);
		}
		catch (IOException ex){
			System.err.println("File Not Found.");
		}

		//List Address Book
    	ab.list();
    }

    public static void initAddressBook(){
    	Entry entry1 = new Entry("Tristan", "Brodrick", "25200 Carlos Bee Blvd", "Hayward", "CA", "94542", "(707)239-1512", "tbodrick@horizon.csueastbay.edu");
		Entry entry2 = new Entry();
    	ab.add(entry1);
		ab.add(entry2);
	}

	/*
	*@param file path to the file being read in from
	 */
	public static void init(String fileName) throws FileNotFoundException {
		File file = new File(fileName);
		Scanner scan = new Scanner(file);
		scan.useDelimiter(",");
		Entry ent = new Entry();
		while(scan.hasNext()){
			ent.setFirstName(scan.next());
			ent.setLastName(scan.next());
			ent.setStreet(scan.next());
			ent.setCity(scan.next());
			ent.setState(scan.next());
			ent.setZip(scan.next());
			ent.setPhone(scan.next());
			ent.setEmail(scan.next());
		}
		ab.add(ent);
	}
}
