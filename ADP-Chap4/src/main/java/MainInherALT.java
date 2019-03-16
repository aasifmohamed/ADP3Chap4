public class MainInherALT {


    public void display(){
        Employee sub = new Employee("James Beek", "123 ABC", 32, 3600.00);

        System.out.println(sub.toString() + super.toString());

    }

    public static void main(String[]args){
        MainInherALT run = new MainInherALT();
        run.display();
    }
}
