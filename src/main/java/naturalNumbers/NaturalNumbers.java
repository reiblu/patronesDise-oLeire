package naturalNumbers;

public abstract class NaturalNumbers {
    
    private int value;
    private String[] textValues;

    public NaturalNumbers(int numero) {
        super();
        this.value = numero;
    }
    
    public void setTextValues(String[] textValues) {
        this.textValues = textValues;
    }

    public String getTextValue(){
        return this.textValues[this.getValue()];
    }
    
    public int getValue(){
        return value;
    }
    
    public void setValue(int value) {
        assert value >= 0;
        this.value = value;
    }
    
    public void add(int value) {
        this.setValue(this.value + value);
    }

    
}
