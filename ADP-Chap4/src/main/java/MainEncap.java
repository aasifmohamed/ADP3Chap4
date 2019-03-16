public class MainEncap {

    public static void main(String args[]) {
        Person encap = new Person();
        encap.setName("James");
        encap.setNumber(20);
        encap.setAddress("12343ms");

        System.out.print("Name : " + encap.getName() + " Number : " + encap.getNumber() + " Address : " + encap.getAddress());
    }
}
