import org.junit.Test;

public class ISPToyTest {
    @Test
    public void testBuildToyHouse() throws Exception {
        ISPToyHouse toyHouse=ISPToyMain.buildToyHouse();
        System.out.println(toyHouse);
    }

    @Test
    public void testBuildToyPlane() throws Exception {
        ISPToyPlane toyPlane=ISPToyMain.buildToyPlane();
        System.out.println(toyPlane);
    }
}
