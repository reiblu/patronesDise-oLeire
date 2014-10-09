package expresion;

public abstract class GestorExpresion extends Expresion {
    
    protected Expresion exp1;
    protected Expresion exp2;

    public GestorExpresion(Expresion exp1, Expresion exp2) {
        this.exp1 = exp1;
        this.exp2 = exp2;
    }

    @Override
    public abstract int operar();

    @Override
    public abstract String toString();

}
