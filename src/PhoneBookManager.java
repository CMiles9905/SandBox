import java.util.ArrayList;

public class PhoneBookManager {
    Node first;
    public void setData(String firstName, String lastName, String address,
                        String city, String phoneNumber){
        Node current = first;
        if(current == null) {
            first = new Node(firstName,lastName,address,city,phoneNumber);
            return;
        }
        while(current.next != null){
            current=current.next;
        }
        current.next = new Node(firstName,lastName,address,city,phoneNumber);
    }
    public String toString() {
        String info = "";
        Node current = first;
        while (current != null) {
            info += current.firstName + " ";
            current = current.next;
        }
    return info;
    }
}
