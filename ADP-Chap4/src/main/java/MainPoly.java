public class MainPoly {
    public static void main(String [] args) {
        Employee e = new Employee("James Beek", "123 ABC", 32, 3600.00);
        Person p = new Employee("John Adams", "456 DEF", 12, 2400.00);
        System.out.println("Call mailCheck using Salary reference --");
        e.mailCheck();
        System.out.println("\n Call mailCheck using Employee reference--");
        p.mailCheck();
    }
}
