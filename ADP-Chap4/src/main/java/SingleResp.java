public class SingleResp {
    String text;

    public SingleResp(String txt){
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
}

class PrintText{
    SingleResp sngl;

    PrintText(SingleResp sngl){
        this.sngl = sngl;
    }

    public void printText(){
        System.out.println(sngl.text);
    }
}
