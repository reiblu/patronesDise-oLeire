package naturalNumbers;

public abstract class NaturalNumbers {
    
    private String numerotexto;
    private int value;

    public NaturalNumbers(String numerotexto, int numero) {
        super();
        this.value = numero;
        this.numerotexto = numerotexto;
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
