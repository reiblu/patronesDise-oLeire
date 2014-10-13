package editor;

public class Caracter extends Componente {

    private char caracter;

    public Caracter(char c) {
        this.caracter = c;
    }

    @Override
    public void add(Componente h) {

    }

    @Override
    public String dibujar(boolean b) {
        if (b) {
            return Character.toString(caracter).toUpperCase();
        } else {
            return Character.toString(caracter).toLowerCase();
        }
    }

    @Override
    public void remove(Componente h) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public boolean isComposite() {
        // TODO Auto-generated method stub
        return false;
    }
}
