package pl.learn.theory.javaclass1.solid.open_close_principle;

// T -- bo w ten sposob moge z automatu lepiej podstawiac
public interface Saver<T> {

    void save(T secret);
}
