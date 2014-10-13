package visitor;

public class Visitor2 extends Visitor {
    
    private int[] cosas = new int[2];

    @Override
    public void visitElementA(ElementA e) {
        this.cosas[0]++;
        
    }

    @Override
    public void visitElementB(ElementB e) {
        this.cosas[1]++;
        
    }

    public int getAs() {
        return this.cosas[0];
    }

    public int getBs() {
        return this.cosas[1];
    }

}
