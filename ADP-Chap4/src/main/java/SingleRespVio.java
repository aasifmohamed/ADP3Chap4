public class SingleRespVio {
    String text;

    public SingleRespVio(String txt){
        this.text = txt;
    }

    public void setText(String text){
        this.text = text;
    }
    public String getText() {
        return text;
    }

    //methods change state of text
    public void allLettersToUpperCase() {
        this.text = text.toUpperCase();
    }

    public void allLettersToLowerCase() {
        this.text = text.toLowerCase();
    }

    //method printing text in same class which violates single responsibility
    public void printText(){
        System.out.println(text);
    }
}
