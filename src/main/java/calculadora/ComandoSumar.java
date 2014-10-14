package calculadora;

import upm.jbb.IO;

public class ComandoSumar extends GestorOperaciones {

    public ComandoSumar(Calculadora calculadora) {
        super(calculadora);
    }

    public String name() {
        return "Sumar";
    }

    @Override
    public void execute() {
        int sumando = IO.in.readInt("sumando");
        this.getCalculadora().sumar(sumando);
        
    }

}
