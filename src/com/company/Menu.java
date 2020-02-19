package com.company;

import java.awt.print.Book;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * @author Tristan Brodrick
 * @since 1.2
 */
class Menu{
    Scanner in = new Scanner(System.in);
    String readIn = "";
    AddressBook Book = new AddressBook();

    /*
    * The actual function of the program
    * @param: none
    * @return: none
     */
    public void displayMainMenu() throws FileNotFoundException{
        int flag = 1;
        while (flag != 0) {
            System.out.println("Enter the letter for your selection, then hit enter");
            System.out.println("a) Load from file");
            System.out.println("b) Add a new Entry");
            System.out.println("c) Remove an Entry");
            System.out.println("d) Find an Entry");
            System.out.println("e) List all Entries");
            System.out.println("f) Quit");

            readIn = in.nextLine();
            readIn = readIn.toLowerCase();

            switch (readIn) {
                case "a": {
                    Book.readFromFile();
                    break;
                }
                case "b": {
                    Entry ent = new Entry();
                    ent.setFirstName(prompt_FirstName());
                    ent.setLastName(prompt_LastName());
                    ent.setStreet(prompt_Street());
                    ent.setCity(prompt_City());
                    ent.setState(prompt_State());
                    ent.setZip(prompt_Zip());
                    ent.setPhone(prompt_Phone());
                    ent.setEmail(prompt_Email());
                    Book.add(ent);
                    break;
                }
                case "c": {
                    ArrayList<Entry> possibles = new ArrayList<>();
                    possibles = Book.find(prompt_LastName());
                    if(possibles.size() > 0){
                    System.out.println("Which of these would you like to Remove?");
                    for (int i = 0; i < possibles.size(); i++) {
                        System.out.println((i + 1) + ". " + possibles.get(i).getFirstName() + " " + possibles.get(i).getLastName());
                    }
                    int opIn = in.nextInt();
                    Book.remove(possibles.get(opIn - 1));
                    }
                    else{
                        System.out.println("No Entries found");
                    }
                    break;
                }
                case "d": {
                    ArrayList<Entry> possibles = new ArrayList<>();
                    possibles = Book.find(prompt_LastName());
                    if(possibles.size() > 0) {
                        System.out.println("Which of these would you like to List?");
                        for (int i = 0; i < possibles.size(); i++) {
                            System.out.println((i + 1) + ". " + possibles.get(i).getFirstName() + " " + possibles.get(i).getLastName());
                        }
                        int opIn = in.nextInt();
                        System.out.println(possibles.get(opIn - 1).toString());
                    }
                    else{
                        System.out.println("No Entries found");
                    }
                    break;
                }
                case "e": {
                    Book.list();
                    break;
                }
                case "f":
                    flag = 0;
                    break;
            }
        }
    }
    /*
    * Propmpts the user for their first name
    * @return the user input
     */
    public String prompt_FirstName(){
        System.out.println("First Name: ");
        readIn = in.nextLine();
        return readIn;
    }

    /*
     * Propmpts the user for their last name
     * @return the user input
     */
    public String prompt_LastName(){
        System.out.println("Last Name: ");
        readIn = in.nextLine();
        return readIn;
    }

    /*
     * Propmpts the user for their street address
     * @return the user input
     */
    public String prompt_Street(){
        System.out.println("Street: ");
        readIn = in.nextLine();
        return readIn;
    }

    /*
     * Propmpts the user for their city of residence
     * @return the user input
     */
    public String prompt_City() {
        System.out.println("City: ");
        readIn = in.nextLine();
        return readIn;
    }

    /*
     * Propmpts the user for their state of residence
     * @return the user input
     */
    public String prompt_State() {
        System.out.println("State: ");
        readIn = in.nextLine();
        return readIn;
    }

    /*
     * Propmpts the user for their zip code
     * @return the user input
     */
    public int prompt_Zip() {
        int readNum = 0;
        System.out.println("Zip: ");
        readNum = Integer.parseInt(in.nextLine());
        return readNum;
    }

    /*
     * Propmpts the user for their phone number
     * @return the user input
     */
    public String prompt_Phone() {
        System.out.println("Phone: ");
        readIn = in.nextLine();
        return readIn;
    }

    /*
     * Propmpts the user for their email address
     * @return the user input
     */
    public String prompt_Email() {
        System.out.println("Email: ");
        readIn = in.nextLine();
        return readIn;
    }
}