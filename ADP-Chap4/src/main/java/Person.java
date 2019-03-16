public class Person {
    private String name;
    private String address;
    private int number;

    public Person(){

    }

    public Person(String name, String address, int number) {
        this.name = name;
        this.address = address;
        this.number = number;
    }

    public void mailCheck() {
        System.out.println("Mailing a check to " + this.name + " " + this.address);
    }

    public void setName(String newName){
        name = newName;
    }

    public String getName() {
        return name;
    }

    public void setAddress(String newAddress) {
        address = newAddress;
    }

    public String getAddress() {
        return address;
    }

    public void setNumber(int newNumber){
        number = newNumber;
    }

    public int getNumber() {
        return number;
    }

    public void displayPerson(){
        System.out.println("Name: " + name + " " + "Address: " + address + " " + "Number: " + number);
    }

    public String toString() {
        return "Name: " + name + " " + "Address: " + address + " " + "Number: " + number;
    }
}
