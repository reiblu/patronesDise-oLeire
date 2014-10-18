package naturalNumbers;

public class Espanol extends NaturalNumbers {
    
    private String [] texValue = {"cero", "uno", "dos", "tres", "cuatro", "cinco"};

    public Espanol(int numero) {
        super(numero);
    }

    @Override
    public String getTextValue() {
        return this.texValue[this.getValue()];
    }

}
