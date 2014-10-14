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
    public String dibujar(boolean b) {
        // TODO Auto-generated method stub
        return null;
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
