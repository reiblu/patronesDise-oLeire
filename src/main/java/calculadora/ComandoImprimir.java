package calculadora;

import upm.jbb.IO;

public class ComandoImprimir implements Comando {
    
    private Calculadora calculadora;

    public ComandoImprimir(Calculadora calculadora) {
        this.calculadora = calculadora;
    }

    @Override
    public String name() {
        return "Imprimir";
    }

    @Override
    public void execute() {
        IO.out.println(this.calculadora.getTotal());
        
    }

}
