public class DIPPowerSwitch implements DIPSwitchInter{
        public DIPSwitchableInter client;
        public boolean on;
        public DIPPowerSwitch(DIPSwitchableInter client) {
            this.client = client;
            this.on = false;
        }
        public boolean isOn() {
            return this.on;
        }
        public void press(){
            boolean checkOn = isOn();
            if (checkOn) {
                client.turnOff();
                this.on = false;
            } else {
                client.turnOn();
                this.on = true;
            }

        }
    }
