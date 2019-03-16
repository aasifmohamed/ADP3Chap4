import org.junit.Assert;
import org.junit.Test;

public class MainInherALTTest {

    @Test
    public void display(){
        Employee sub = new Employee("James Beek", "123 ABC", 32, 3600.00);

        Assert.assertEquals("James Beek",sub.getName());
        Assert.assertEquals(32,sub.getNumber());
        Assert.assertEquals("123 ABC",sub.getAddress());
        Assert.assertEquals(3600.00,sub.getSalary(),2);

        System.out.println(super.toString() + sub.toString());

    }
}
