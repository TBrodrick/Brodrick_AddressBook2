package com.company;

import java.util.ArrayList;

/*
 * @author Tristan Brodrick
 * @since 1.2
 */
public class AddressBook{
    private static ArrayList<Entry> Book = new ArrayList<Entry>();
    /*
    *@param Entry to be added to the address book
     */
    public static void add(Entry newEntry){
        Book.add(newEntry);
    }
    public static void list(){
        for(int i = 0; i < Book.size(); i++){
            System.out.println(Book.get(i).toString());
            System.out.println();
        }
    }
}