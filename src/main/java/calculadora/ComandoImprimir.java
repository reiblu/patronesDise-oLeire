package calculadora;

import upm.jbb.IO;

public class ComandoImprimir extends GestorOperaciones {

    public ComandoImprimir(Calculadora calculadora) {
        super(calculadora);
    }

    @Override
    public String name() {
        return "Imprimir";
    }

    @Override
    public void execute() {
        IO.out.println(this.getCalculadora().getTotal());
        
    }

}
