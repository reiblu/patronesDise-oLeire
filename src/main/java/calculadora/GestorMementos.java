package calculadora;

import java.util.SortedMap;
import java.util.TreeMap;

public class GestorMementos {
    private SortedMap<String, MementoCalculadora> lista = new TreeMap<String, MementoCalculadora>();
    private static GestorMementos gestor;
    
    private GestorMementos(){
        
    }
    
    public static GestorMementos getGestor() {
        if(GestorMementos.gestor==null){
            GestorMementos.gestor = new GestorMementos();
        }
        return GestorMementos.gestor;
    }

    public void addMemento(String key, MementoCalculadora memento) {
        this.lista.put(this.lista.size() + ":" + key, memento);
    }

    public MementoCalculadora getMemento(String key) {
        return this.lista.get(key);
    }

    public String[] keys() {
        return this.lista.keySet().toArray(new String[0]);
    }
}
