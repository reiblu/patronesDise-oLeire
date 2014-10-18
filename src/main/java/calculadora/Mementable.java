package calculadora;

public interface Mementable {
    MementoCalculadora createMemento();

    void restoreMemento(MementoCalculadora memento);

}
