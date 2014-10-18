package calculadora;

import upm.jbb.IO;

public class ComandoDeshacer extends GestorOperaciones {

    public ComandoDeshacer(Calculadora calculadora) {
        super(calculadora);
    }

    @Override
    public String name() {
        return "Deshacer";
    }

    @Override
    public void execute() {
        CalculadoraMementable c = (CalculadoraMementable)this.getCalculadora();
        MementoCalculadora memento = GestorMementos.getGestor().getMemento((String)IO.in.select(GestorMementos.getGestor().keys()));
        c.restoreMemento(memento);

    }

}
