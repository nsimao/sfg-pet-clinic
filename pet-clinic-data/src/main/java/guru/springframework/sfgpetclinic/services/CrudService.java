package guru.springframework.sfgpetclinic.services;

import java.util.Set;

/**
 * @author Nelson Simão
 * @since 1.0
 */

public interface CrudService<T, ID> {
// -------------------------- OTHER METHODS --------------------------

    void delete(T object);

    void deleteById(ID id);

    Set<T> findAll();

    T findById(ID id);

    T save(T object);
}
