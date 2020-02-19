package com.company;

import java.awt.print.Book;
import java.util.Scanner;

/*
 * @author Tristan Brodrick
 * @since 1.2
 */
class Menu{
    Scanner in = new Scanner(System.in);
    String readIn;

    /*
    * @param: none
    * @return: The character of the
     */
    public void displayMainMenu(AddressBook Book){
        System.out.println("Enter the letter for your selection, then hit enter");
        System.out.println("a) Load from file");
        System.out.println("b) Add a new Entry");
        System.out.println("c) Remove an Entry");
        System.out.println("d) Find an Entry");
        System.out.println("e) List all Entries");
        System.out.println("f) Quit");

        readIn = in.nextLine();
        readIn.toLowerCase();

        switch (readIn){
            case "a":{

            }
        }
    }

    public String prompt_FirstName(){
        System.out.println("First Name: ");
        readIn = in.nextLine();
        return readIn;
    }
    public String prompt_LastName(){
        System.out.println("Last Name: ");
        readIn = in.nextLine();
        return readIn;
    }
    public String prompt_Street(){
        System.out.println("Street: ");
        readIn = in.nextLine();
        return readIn;
    }
    public String prompt_City() {
        System.out.println("City: ");
        readIn = in.nextLine();
        return readIn;
    }
    public String prompt_State() {
        System.out.println("State: ");
        readIn = in.nextLine();
        return readIn;
    }
    public String prompt_Zip() {
        System.out.println("Zip: ");
        readIn = in.nextLine();
        return readIn;
    }
    public String prompt_Phone() {
        System.out.println("Phone: ");
        readIn = in.nextLine();
        return readIn;
    }
    public String prompt_Email() {
        System.out.println("Email: ");
        readIn = in.nextLine();
        return readIn;
    }
}