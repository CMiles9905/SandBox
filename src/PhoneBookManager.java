

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
            info += current.firstName + " " + current.lastName + " " + current.address + " ";
            current = current.next;
        }
    return info;
    }
    public void modifyfirstName(String name, String newName){
        Node current = first;
        if(current.firstName.equalsIgnoreCase(name)) {
            current.firstName = newName;
        }
        while(current.next != null){
            current = current.next;
            if(current.firstName.equalsIgnoreCase(name)){
                current.firstName = newName;
                break;
            }
        }
    }
    public void modifylastName(String name, String newName){
        Node current = first;
        if(current.firstName.equalsIgnoreCase(name)) {
            current.lastName = newName;
        } else {
            while(current.next != null){
                current = current.next;
                if(current.firstName.equalsIgnoreCase(name)) {
                    current.lastName = newName;
                    break;
                }
            }
        }
    }
    public void modifyAddress(String name, String address){
        Node current = first;
        if(current.firstName.equalsIgnoreCase(name)) {
            current.address = address;
        } else {
            while(current.next != null){
                current = current.next;
                if(current.firstName.equalsIgnoreCase(name)) {
                    current.address = address;
                    break;
                }
            }
        }
    }
}
