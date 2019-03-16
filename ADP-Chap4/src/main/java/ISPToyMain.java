public class ISPToyMain {
    public static ISPToyHouse buildToyHouse(){
        ISPToyHouse toyHouse=new ISPToyHouse();
        toyHouse.setPrice(15.00);
        toyHouse.setColor("green");
        return toyHouse;
    }

    public static ISPToyPlane buildToyPlane(){
        ISPToyPlane toyPlane=new ISPToyPlane();
        toyPlane.setPrice(125.00);
        toyPlane.setColor("white");
        toyPlane.fly();
        return toyPlane;
    }
}
