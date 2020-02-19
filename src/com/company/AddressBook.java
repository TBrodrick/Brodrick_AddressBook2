package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * @author Tristan Brodrick
 * @since 1.2
 */
public class AddressBook{
    private static ArrayList<Entry> Book = new ArrayList<>();
    /*
    *@param Entry to be added to the address book
     */
    public static void add(Entry newEntry){
        Book.add(newEntry);
    }

    public static ArrayList<String> find(String lastName){
        ArrayList<String> possibleEntries = new ArrayList<>();

        for(int i = 0; i < Book.size(); i++){
            if(Book.get(i).getLastName() == lastName){
                possibleEntries.add(Book.get(i).getFirstName() + " " + Book.get(i).getLastName());
            }
        }
        return possibleEntries;
    }

    public void remove(String name){
        int loc = -1;
        for(int i = 0; i < Book.size(); i++){
            if((Book.get(i).getFirstName() + " " + Book.get(i).getLastName()) == name){
                loc = i;
            }
        }
        if(loc > -1)
            Book.remove(loc);
    }
    /*
     * @param Address book to add the entries to
     */
    public static void readFromFile() throws FileNotFoundException {
        //Read file name
        System.out.println("Enter the name of the file you wish to read from:");
        Scanner in = new Scanner(System.in);
        String fileName = in.nextLine();

        //Try to access file. test: C:/Users/trist/IdeaProjects/AddressBookApp/src/com/company/testIn.txt
        File file = new File(fileName);
        Scanner scan = new Scanner(file);
        scan.useDelimiter(", ");
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
        Book.add(ent);
    }

    public static void list(){
        for(int i = 0; i < Book.size(); i++){
            System.out.println(Book.get(i).toString());
            System.out.println();
        }
    }
}