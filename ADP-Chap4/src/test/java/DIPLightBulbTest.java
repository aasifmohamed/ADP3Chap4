import org.junit.Test;
public class DIPLightBulbTest {
    @Test
    public void testPress() throws Exception {
        DIPSwitchableInter switchableBulb = new DIPLightBulb();
        DIPSwitchInter bulbPowerSwitch = new DIPPowerSwitch(switchableBulb);
        bulbPowerSwitch.press();
        bulbPowerSwitch.press();
    }
}
