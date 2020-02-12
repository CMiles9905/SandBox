import java.util.*;

public class PhoneBook {
public static void main(String[] args) {
    String response = "";
    Scanner input = new Scanner(System.in);
    System.out.println("+ to add a new entry");
    System.out.println("q to quit");
    PhoneBookManager phoneBook = new PhoneBookManager();
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
        System.out.println("+ to add a new entry");
        System.out.println("q to quit");
        response = input.next();
    }
    String s = phoneBook.toString();
    System.out.print(s);
    }
}




