package krykra.spring.sfgpetclinic.services;

import java.util.Set;

/**
 * Created by kk on 8/27/2018.
 */
public interface CrudService<T, ID> {

    T findById(ID id);

    Set<T> findAll();

    T save(T object);

    void delete(T object);

    void deleteById(ID id);
}
