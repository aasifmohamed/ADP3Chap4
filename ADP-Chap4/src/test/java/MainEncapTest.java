import org.junit.Assert;
import org.junit.Test;

public class MainEncapTest {

    @Test
    public void testEncap() {
        Person encap = new Person();
        encap.setName("James");
        encap.setNumber(20);
        encap.setAddress("12343ms");

        Assert.assertEquals("James",encap.getName());
        Assert.assertEquals(20,encap.getNumber());
        Assert.assertEquals("12343ms",encap.getAddress());

        System.out.print("Name : " + encap.getName() + " Number : " + encap.getNumber() + " Address : " + encap.getAddress());
    }
}
