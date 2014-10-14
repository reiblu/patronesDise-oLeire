package calculadora;

public class ComandoIniciar implements Comando {
    
    private Calculadora calculadora;

    public ComandoIniciar(Calculadora calculadora) {
        this.calculadora = calculadora;
    }

    @Override
    public String name() {
        return "Iniciar";
    }

    @Override
    public void execute() {
        this.calculadora.iniciar();
        
        
    }

}
