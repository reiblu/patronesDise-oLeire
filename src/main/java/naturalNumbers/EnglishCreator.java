package naturalNumbers;

public class EnglishCreator extends NaturalNumbersCreator {

    @Override
    public NaturalNumbers createNaturalNumbers(int numero) {
        return new English(numero);
    }

}
