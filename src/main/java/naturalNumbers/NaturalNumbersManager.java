package naturalNumbers;

public class NaturalNumbersManager {

    private NaturalNumbersCreator creador;
    private NaturalNumbers numero;
    
    public void setCreador(NaturalNumbersCreator creador){
        this.creador = creador;
    }
    
    public void createNaturalNumbers(){
        this.numero = this.creador. createNaturalNumbers();
    }
    
    public NaturalNumbers getNaturalNumber(){
        return numero;
    }
    
}
