package calculadora;

public class MementoCalculadora {
    
    private int valor;

    public MementoCalculadora(int total) {
        this.valor=total;
    }
    
    public int getValor(){
        return valor;
    }

}
