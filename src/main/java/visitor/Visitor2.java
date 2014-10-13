package visitor;

public class Visitor2 extends Visitor {

    @Override
    public void visitElementA(ElementA e) {
        System.out.println("Visitador 2 --> elemento: " + e.getAttributeA());
        
    }

    @Override
    public void visitElementB(ElementB e) {
        System.out.println("Visitador 2 --> elemento: " + e.getAttributeB());
        
    }

    public Object getAs() {
        // TODO Auto-generated method stub
        return null;
    }

    public Object getBs() {
        // TODO Auto-generated method stub
        return null;
    }

}
