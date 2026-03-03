package Mini_Project.interfaces;

public interface IManager<T> {
    void add(T t);

    void update(T t);

    void remove(T t);

    T findById(String id);

    void displayAll();

    boolean isEmpty();
}
