package treeNumber;

public class LeafNode extends TreeNumbers {
    
    private int numero;

    public LeafNode() {
       this.numero = numero;
    }

    @Override
    public void add(TreeNumbers nodo) {
        
    }

    @Override
    public void remove(TreeNumbers nodo) {
        
    }

    @Override
    public int numberofNodes() {
        return 1;
    }

    @Override
    public int sum() {
        return this.numero;
    }

    @Override
    public int higher() {
        return this.numero;
    }

}
