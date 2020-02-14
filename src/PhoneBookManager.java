

public class PhoneBookManager {
    Node first;
    //Accepts user input as parameters and stores them in an linked list

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
    //A method for printing the contents of the phonebook to the console

    public String toString() {
        String info = "";
        Node current = first;
        while (current != null) {
            info += current.firstName + " " + current.lastName +"\n" + current.address
            + "\n" + current.phoneNumber + "\n" + current.city + "\n" +"\n";
            current = current.next;
        }
    return info;
    }
    //A method which modifies the first name of the selected phonebook entry

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
    //A method which modifies the last name of the selected phonebook entry
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
    //A method which modifies the first address of the selected phonebook entry
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
//    public void sortList(){
//        Node current = new Node();
//        Node temp = new Node();
//        current = first;
//        int i = 0;
//        while(current.next != null) {
//
//        }
//    }

    public int getCount(){
    int count = 0;
    Node current = first;
        while(current != null){
            count++;
            current = current.next;
        }
    return count;
    }
    public void sortList(){
    int count = getCount();
    Node current = first;
    Node temp, after;
    int i = 0;
        while(i < (count-1)){
            System.out.println(i);
            System.out.println(current.next==null);
            if(current.lastName.compareToIgnoreCase(current.next.lastName) > 0){
                this.swapNodes(i);
                i = 0;
            } else {
                i++;
            }
            if (current.next == null) {
                current = first;
            }
            else{
                current = current.next;
            }
        }
    }
    public void swapNodes(int index){
        Node current = first;
        if(current==null) return;
        for(int i =0; i<(index-1); i++)
        {
            if(current.next!=null) current = current.next;
            else return;
        }
        Node temp, after;
        temp = current.next;
        if(current.next.next != null) after = current.next.next.next;
        else after = null;
        if(current.next != null && current.next.next != null) {
            current.next = current.next.next;
            temp.next = after;
        }
        else {
            first = temp;
            temp.next = current;
            current.next = null;
        }
    }
}
