package calculadora;

import upm.jbb.IO;

public class ComandoRestar implements Comando {
    
    private Calculadora calculadora;

    public ComandoRestar(Calculadora calculadora) {
        this.calculadora = calculadora;
    }

    @Override
    public String name() {
        return "Restar";
    }

    @Override
    public void execute() {
        int resta = IO.in.readInt("resta");
       this.calculadora.restar(resta);
       
    }

}
