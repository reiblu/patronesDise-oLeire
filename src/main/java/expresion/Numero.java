package expresion;

public class Numero extends Expresion {

    private int numero;

    public Numero(int numero) {
        this.numero = numero;
    }

    @Override
    public int operar() {

        return this.numero;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return null;
    }

}
