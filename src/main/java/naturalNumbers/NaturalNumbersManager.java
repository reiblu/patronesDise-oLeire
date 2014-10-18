package naturalNumbers;

public class NaturalNumbersManager {

    private NaturalNumbersCreator creador;
    private NaturalNumbers numero;
    
    public void setCreador(NaturalNumbersCreator creador){
        this.creador = creador;
    }
    
    public void createNaturalNumbers(int numero){
        this.numero = this.creador. createNaturalNumbers(numero);
    }
    
    public NaturalNumbers getNaturalNumber(){
        return numero;
    }
    
}
