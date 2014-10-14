package editor;

public class Texto extends Composite {

    @Override
    public void add(Componente componente) {
        if (!componente.isComposite()) {
            throw new UnsupportedOperationException("Acción no permitida... ");
        } else {
            compuestos.add(componente);
        }

    }

    @Override
    public String dibujar(boolean mayuscula) {
        StringBuilder temporal = new StringBuilder();
        if (!mayuscula) {
            for (Componente componente : compuestos) {
                temporal.append(componente.dibujar(false));
            }
        } else {
            for (Componente componente : compuestos) {
                temporal.append((componente.dibujar(true)));
            }
        }

        temporal.append("---o---\n");
        String resultado = temporal.toString();
        return resultado;
    }

    @Override
    public void remove(Componente componente) {
        if (!componente.isComposite()) {
            throw new UnsupportedOperationException("Acción no permitida... ");
        } else {
            compuestos.remove(componente);
        }

    }

}
