package calculadora;

import upm.jbb.IO;

public class ComandoSumar implements Comando {
    
    private Calculadora calculadora;
    
    public ComandoSumar(Calculadora calculadora){
        this.calculadora = calculadora;
    }

    public String name() {
        return "Sumar";
    }

    @Override
    public void execute() {
        int sumando = IO.in.readInt("sumando");
        this.calculadora.sumar(sumando);
        
    }

}
