package com.company;

public class Address {
    public String Street;
    public String City;
    public String State;
    public int Zip;

    Address(String street, String city, String state, int zip, String phone, String email) {
        Street = street;
        City = city;
        State = state;
        Zip = zip;
    }

    /*
     * @return a string listing of the Address
     */
    public String toString(){
        return "Street: " + Street + "\nCity: " + City + "\nState: " + State + "\nZip: " + Zip;
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

}
