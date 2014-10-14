package calculadora;

public class ComandoGuardar extends GestorOperaciones {

    public ComandoGuardar(Calculadora calculadora) {
        super(calculadora);
    }

    @Override
    public String name() {
        return "Guardar";
    }

    @Override
    public void execute() {
        this.getCalculadora();

    }

}
