package naturalNumbers;

public class English extends NaturalNumbers {
    
    private String[] textValue = {"zero", "one", "two", "three", "four", "five"};

    public English(int numero) {
        super(numero);
    }

    @Override
    public String getTextValue() {
        return this.textValue[this.getValue()];
    }

}
