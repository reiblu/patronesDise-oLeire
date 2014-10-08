package treeNumber;

import java.util.ArrayList;
import java.util.List;

public class CompositeNode extends TreeNumbers {

    private String name;

    private List<TreeNumbers> lista;

    public CompositeNode() {
        this.name = name;
        this.lista = new ArrayList<TreeNumbers>();
    }

    @Override
    public void add(TreeNumbers nodo) {
        if (nodo != null) {
            lista.add(nodo);
        }

    }

    @Override
    public void remove(TreeNumbers nodo) {
        if (nodo != null) {
            lista.remove(nodo);
        }

    }

    @Override
    public int numberofNodes() {
        return 0;
    }

    @Override
    public int sum() {
        int resultado = 0;
        for (TreeNumbers treeNumbers : lista) {
            resultado += treeNumbers.sum();
        }
        return resultado;
    }

    @Override
    public int higher() {
        // TODO Auto-generated method stub
        return 0;
    }

}
