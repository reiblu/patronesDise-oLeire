package naturalNumbers;

public class EspanolCreator extends NaturalNumbersCreator {

    @Override
    public NaturalNumbers createNaturalNumbers() {
        return new Espanol(3);
    }

}
