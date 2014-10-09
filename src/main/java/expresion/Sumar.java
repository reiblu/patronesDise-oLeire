package expresion;

public class Sumar extends GestorExpresion {

    public Sumar(Expresion exp1, Expresion exp2) {
        super(exp1, exp2);
    }

    @Override
    public int operar() {

        return exp1.operar() + exp2.operar();
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return null;
    }

}
