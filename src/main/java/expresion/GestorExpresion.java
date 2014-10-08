package expresion;

public abstract class GestorExpresion extends Expresion {

    public GestorExpresion(Expresion exp1, Expresion exp2) {
        super(exp1, exp2);
    }

    @Override
    public abstract int operar();

    @Override
    public abstract String toString();

}
