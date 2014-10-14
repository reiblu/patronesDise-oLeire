package editor;

import java.util.ArrayList;
import java.util.List;

public abstract class Composite extends Componente{
    
    protected List<Componente> compuestos;
    
    public Composite() {
        super();
        this.compuestos = new ArrayList<Componente>();
    }

    public abstract void add(Componente h);

    public abstract String dibujar(boolean b);

    public abstract void remove(Componente h);
    
    public boolean isComposite(){
        return true;
    }

}
