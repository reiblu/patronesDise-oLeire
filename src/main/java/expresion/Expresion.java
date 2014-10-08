package expresion;

public abstract class Expresion {
    
    private Expresion exp1;
    private Expresion exp2;
    private int numero;
    
    public Expresion(Expresion exp1, Expresion exp2){
        super();
        this.exp1 = exp1;
        this.exp2 = exp2;
    }
    
    public Expresion(int numero){
        super();
        this.numero=numero;
    }

    public abstract int operar();
    
    public abstract String toString();

}
