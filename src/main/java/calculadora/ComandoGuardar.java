package calculadora;

import upm.jbb.IO;

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
        CalculadoraMementable c = (CalculadoraMementable)this.getCalculadora();
        MementoCalculadora memento = c.createMemento();
        GestorMementos.getGestor().addMemento(IO.in.readString("Titulo nuevo memento: "), memento);


    }

}
