public class Node {
    public String firstName;
    public String lastName;
    public String address;
    public String city;
    public String phoneNumber;
    public Node next;
    public Node() {
        this.firstName = null;
        this.lastName = null;
        this.address = null;
        this.city = null;
        this.phoneNumber = null;
        this.next = null;
    }
    public Node(String firstName, String lastName, String address, String city,
                String phoneNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.phoneNumber = phoneNumber;
        this.next = null;
    }
    public Node(String firstName, String lastName, String address, String city,
                String phoneNumber, Node next){
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.phoneNumber = phoneNumber;
        this.next = next;
    }
}

