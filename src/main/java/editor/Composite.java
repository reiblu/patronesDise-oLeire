package editor;

public abstract class Composite extends Componente{
    
    public abstract void add(Componente h);

    public abstract String dibujar(boolean b);

    public abstract void remove(Componente h);
    
    public boolean isComposite(){
        return true;
    }

}
