package org.example.Généricité;

import java.util.List;

public interface IMetier<T> {

     void add(T o);
     List<T> getAll();
     T findById(long o);
     void delete(long id);
}
