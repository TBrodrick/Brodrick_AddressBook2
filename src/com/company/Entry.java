package com.company;

/*
 * @author Tristan Brodrick
 * @since 1.2
 */
public class Entry {
    private String FirstName;
    private String LastName;
    private String Street;
    private String City;
    private String State;
    private int Zip;
    private String Phone;
    private String Email;

    Entry(){
        FirstName = "first";
        LastName = "last";
        Street = "street";
        City = "city";
        State = "state";
        Zip = 0;
        Phone = "(000)000-0000";
        Email = "Example@example.com";
    }

    /*
    * @param Added person's first name
    * @param Added person's last name
    * @param Added person's street address
    * @param Added person's city
    * @param Added person's state
    * @param Added person's zip code
    * @param Added person's phone number
    * @param Added person's email address
     */
    Entry(String first, String last, String street, String city, String state, int zip, String phone, String email){
        FirstName = first;
        LastName = last;
        Street = street;
        City = city;
        State = state;
        Zip = zip;
        Phone = phone;
        Email = email;
    }
    /*
    * @return a string listing of the entry
     */
    public String toString(){
       return "First Name: " + FirstName + "\nLast Name: " + LastName + "\nStreet: " + Street + "\nCity: " + City + "\nState: " + State + "\nZip: " + Zip + "\nPhone: " + Phone + "\nEmail: " + Email;
    }

    /*
    * @param Added person's new first name
     */
    public void setFirstName(String name){
        FirstName = name;
    }

    /*
     * @return entry's first name
     */
    public String getFirstName(){
        return FirstName;
    }

    /*
     * @param Added person's new last name
     */
    public void setLastName(String name){
        LastName = name;
    }

    /*
     *  @return entry's last name
     */
    public String getLastName(){
        return LastName;
    }

    /*
     * @param Added person's new street address
     */
    public void setStreet(String street){
        Street = street;
    }

    /*
     * @return entry's street address
     */
    public String getStreet(){
        return Street;
    }

    /*
     * @param Added person's new city
     */
    public void setCity(String city){
        City = city;
    }

    /*
     * @return entry's city
     */
    public String getCity(){
        return City;
    }

    /*
     * @param Added person's new state
     */
    public void setState(String state){
        State = state;
    }

    /*
     * @return entry's state
     */
    public String getState(){
        return State;
    }

    /*
     * @param Added person's new zip code
     */
    public void setZip(int zip){
        Zip = zip;
    }

    /*
     * @return entry's zip code
     */
    public int getZip(){
        return Zip;
    }

    /*
     * @param Added person's phone number
     */
    public void setPhone(String phone){
        Phone = phone;
    }

    /*
     * @return entry's phone number
     */
    public String getPhone(){
        return Phone;
    }

    /*
     * @param Added person's email address
     */
    public void setEmail(String email){
        Email = email;
    }

    /*
     * @return entry's email address
     */
    public String getEmail(){
        return Email;
    }
}
