package naturalNumbers;

public abstract class NaturalNumbers {
    
    private int value;
    protected String[] textValue;

    public NaturalNumbers(int numero, String[] textValue) {
        super();
        this.value = numero;
        this.textValue = new String[6];
    }
    
    public abstract String getTextValue();
    
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
