package editor;

public class Parrafo extends Composite {
  
    @Override
    public void add(Componente componente) {
        if(componente.isComposite()){
            throw new UnsupportedOperationException("Acción no permitida... ");
        } else {
            compuestos.add(componente);
        }
    }

    @Override
    public String dibujar(boolean mayuscula) {
        String resultado = "";
        if(!mayuscula){
            resultado.concat((compuestos.get(0)).dibujar(true));
            compuestos.remove(0);
            for (Componente componente : compuestos) {
                resultado.concat(componente.dibujar(false));
            }
        } else {
            for (Componente componente : compuestos) {
                resultado.concat(componente.dibujar(true));
            }
        }
        resultado.concat("\n");
        return resultado;
    }

    @Override
    public void remove(Componente componente) {
        if(componente.isComposite()){
            throw new UnsupportedOperationException("Acción no permitida... ");
        } else {
            compuestos.remove(componente);
        }
        
    }

}
