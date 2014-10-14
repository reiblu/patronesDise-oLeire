package calculadora;

import upm.jbb.IO;

public class ComandoRestar extends GestorOperaciones {
    
    public ComandoRestar(Calculadora calculadora) {
        super(calculadora);
    }

    @Override
    public String name() {
        return "Restar";
    }

    @Override
    public void execute() {
        int resta = IO.in.readInt("resta");
       this.getCalculadora().restar(resta);
       
    }

}
