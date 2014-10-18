package naturalNumbers;

public class EspanolCreator extends NaturalNumbersCreator {

    @Override
    public NaturalNumbers createNaturalNumbers(int numero) {
        return new Espanol(numero);
    }

}
