import org.junit.Assert;
import org.junit.Test;

public class MainInherTest {

    @Test
    public void testInher(){
        Employee emp = new Employee("James Beek", "123 ABC", 32, 3600.00);

        Assert.assertEquals("James Beek",emp.getName());
        Assert.assertEquals(32,emp.getNumber());
        Assert.assertEquals("123 ABC",emp.getAddress());
        Assert.assertEquals(3600.00,emp.getSalary(),2);

        emp.displayPerson();
        emp.displayEmpDetails();
    }
}
