package naturalNumbers;

public class EnglishCreator extends NaturalNumbersCreator {

    @Override
    public NaturalNumbers createNaturalNumbers() {
        return new English("one", 1);
    }

}
