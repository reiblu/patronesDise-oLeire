package calculadora;

public class ComandoIniciar extends GestorOperaciones {

    public ComandoIniciar(Calculadora calculadora) {
        super(calculadora);
    }

    @Override
    public String name() {
        return "Iniciar";
    }

    @Override
    public void execute() {
        this.getCalculadora().iniciar();
        
        
    }

}
