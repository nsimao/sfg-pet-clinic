package guru.springframework.sfgpetclinic.repositories;

import guru.springframework.sfgpetclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * @author Nelson Simão
 * @since 1.0
 */

public interface OwnerRepository extends CrudRepository<Owner, Long> {
// -------------------------- OTHER METHODS --------------------------

    Owner findByLastName(String lastName);

    List<Owner> findAllByLastNameLike(String lastName);
}
