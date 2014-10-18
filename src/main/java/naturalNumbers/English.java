package naturalNumbers;

public class English extends NaturalNumbers {
    
    public English(int numero) {
        super(numero);
        String[] textValue = {"zero", "one", "two", "three", "four", "five"};
        this.setTextValues(textValue);
    }
   
}
