public class ISPToyPlane implements ISPToy,ISPToyFly{
    double price;
    String color;

    @Override
    public void setPrice(double price) {

        this.price = price;
    }
    @Override
    public void setColor(String color) {

        this.color=color;
    }
    @Override
    public void fly(){

        System.out.println("ToyPlane: Start flying plane.");
    }
    @Override
    public String toString(){
        return "ToyPlane: flyable toy plane- Price: "+price+" Color: "+color;
    }
}
