public class Employee extends Person{
    private double salary; // Annual salary

    public Employee(String name, String address, int number, double salary) {
        super(name, address, number);
        setSalary(salary);
    }

    public void mailCheck() {
        System.out.println("Within mailCheck of Salary class ");
        System.out.println("Mailing check to " + getName()
                + " with salary " + salary);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double newSalary) {
        if(newSalary >= 0.0) {
            salary = newSalary;
        }
    }

    public double computePay() {
        return salary/52;
    }

    public void displayEmpDetails(){
        System.out.println("Salary: " + salary + "\n" + "Weekly salary pay for " + getName() + ":\nR " + String.format("%.4g%n", computePay()));
    }

    public String toString() {
        return "Salary: " + salary + "\n" + String.format("%.4g%n", computePay());
    }
}
