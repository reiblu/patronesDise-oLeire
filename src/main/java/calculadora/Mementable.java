package calculadora;

public interface Mementable<T> {
    T createMemento();

    void restoreMemento(T memento);

}
