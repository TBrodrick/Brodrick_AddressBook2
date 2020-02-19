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

    public static ArrayList<Entry> find(String lastName){
        ArrayList<Entry> possibles = new ArrayList<>();
        for(int i = 0; i < Book.size(); i++){
            if(Book.get(i).getLastName().equals(lastName)){
                possibles.add(Book.get(i));
            }
        }
        return possibles;
    }

    public void remove(Entry rem){
        for(int i = 0; i < Book.size(); i++){
            if(Book.get(i) == rem){
                Book.remove(i);
            }
        }
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

        while(scan.hasNextLine()){
            Entry ent = new Entry();
            ent.setFirstName(scan.nextLine());
            ent.setLastName(scan.nextLine());
            ent.setStreet(scan.nextLine());
            ent.setCity(scan.nextLine());
            ent.setState(scan.nextLine());
            ent.setZip(scan.nextLine());
            ent.setPhone(scan.nextLine());
            ent.setEmail(scan.nextLine());
            Book.add(ent);
        }
    }

    public static void list(){
        for(int i = 0; i < Book.size(); i++){
            System.out.println(Book.get(i).toString());
            System.out.println();
        }
    }
}