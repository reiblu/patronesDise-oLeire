package calculadora;

public abstract class GestorOperaciones implements Comando {
    
    protected Calculadora calculadora;
    
    public GestorOperaciones (Calculadora calculadora){
        this.calculadora = calculadora;
    }
    
    protected Calculadora getCalculadora(){
        return this.calculadora;
    }

}
