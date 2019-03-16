import org.junit.Assert;
import org.junit.Test;

public class MainPolyTest {

    @Test
    public void testPoly() {
        Employee e = new Employee("James Beek", "123 ABC", 32, 3600.00);
        Person p = new Employee("John Adams", "456 DEF", 12, 2400.00);

        Assert.assertEquals("James Beek",e.getName());
        Assert.assertEquals(32,e.getNumber());
        Assert.assertEquals("123 ABC",e.getAddress());
        Assert.assertEquals(3600.00,e.getSalary(),2);

        Assert.assertEquals("John Adams",p.getName());
        Assert.assertEquals(12,p.getNumber());
        Assert.assertEquals("456 DEF",p.getAddress());
      //  Assert.assertEquals(2400.00,e.getSalary(),2);

        System.out.println("Call mailCheck using Salary reference --");
        e.mailCheck();
        System.out.println("\n Call mailCheck using Employee reference--");
        p.mailCheck();
    }
}
