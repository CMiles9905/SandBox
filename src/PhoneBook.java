//Chase Miles
//CS 145
//Assignment 2: Phonebook

import java.util.*;

public class PhoneBook {
public static void main(String[] args) {
    String response = "";
    Scanner input = new Scanner(System.in);
    PhoneBookManager phoneBook = new PhoneBookManager();
    instructions();
    response = input.next();
    if(response.equalsIgnoreCase("c") || response.equalsIgnoreCase("p")){
        if(phoneBook.first == null){
            throw new IllegalArgumentException("No phonebook entries have been initialized.");
        } else {
            options(phoneBook);
        }
    }
    //Captures the responses of the user and stores them in a linked list
    while(!response.equals("q")){
        System.out.println("First name: ");
        String firstName = input.next();
        System.out.println("Last name: ");
        String lastName = input.next();
        System.out.print("Address: ");
        String address = input.next();
        System.out.println("City: ");
        String city = input.next();
        System.out.println("Phone number: ");
        String phoneNumber = input.next();
        phoneBook.setData(firstName,lastName,address,city,phoneNumber);
        instructions();
        response = input.next();
            if(response.equalsIgnoreCase("c")){
                options(phoneBook);
                break;
            }
            if(response.equalsIgnoreCase("p")){
//                phoneBook.sortList();
                phoneBook.swapNodes(1);
                String s2 = phoneBook.toString();
                System.out.print(s2);
                break;
            }
        }
    }
    //An options menu for modifying entries in the phonebook

    public static void options(PhoneBookManager phoneBook){
        Scanner input = new Scanner(System.in);
        System.out.println("f to change a first name");
        System.out.println("press l to change a last name");
        System.out.println("# to get count");
        System.out.println("s to sort the phonebook enties");
        System.out.println("p to display the contents of the phone book");
        String response = input.next();
        switch(response){
            case  "f" : System.out.println("enter the first name of the person who's information who " +
                        "you would like to edit");
                        String s = input.next();
                        System.out.println("enter the name you would like to change " + s + "\'s name to");
                        String s1 = input.next();
                        phoneBook.modifyfirstName(s,s1);
                        break;
            case "l" :  System.out.println("enter the first name of the person who's last name you'd like to change.");
                        s = input.next();
                        System.out.println("enter " + s + "\'s new last name");
                        s1 = input.next();
                        phoneBook.modifylastName(s, s1);
                        break;
            case "#" :  System.out.print(phoneBook.getCount());
                        break;
            case "s" :  phoneBook.sortList();
                        options(phoneBook);
                        break;

            default :   System.out.println("invalid entry");
                        options(phoneBook);

        }
    }
    //A basic menu of instructions for the user
    public static void instructions(){
        System.out.println("+ to add a new entry");
        System.out.println("q to quit");
        System.out.println("c to access the options menu");
    }
}





