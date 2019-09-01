package ac.za.cput.adp3.xyzcongolmerate.controllerClasses;

import java.util.HashSet;
import java.util.Set;

public interface ControllerInt<T, t> {
    T create(T t);
    T read(t t);
    T update(T t);
    void delete(t t);
    Set<T> getAll();
}
