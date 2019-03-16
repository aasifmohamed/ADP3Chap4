import org.junit.Test;

import static org.junit.Assert.*;

public class OCPApprovalManagerTest {
    @Test
    public void testProcessClaim() throws Exception {
        HealthInsuranceSurveyor healthInsuranceSurveyor=new HealthInsuranceSurveyor();
        OCPApprovalManager claim1=new OCPApprovalManager();
        claim1.processClaim(healthInsuranceSurveyor);

        VehicleInsuranceSurveyor vehicleInsuranceSurveyor=new VehicleInsuranceSurveyor();
        OCPApprovalManager claim2=new OCPApprovalManager();
        claim2.processClaim(vehicleInsuranceSurveyor);
    }
}
