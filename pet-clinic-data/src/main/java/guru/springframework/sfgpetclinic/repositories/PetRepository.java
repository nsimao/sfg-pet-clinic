package guru.springframework.sfgpetclinic.repositories;

import guru.springframework.sfgpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Nelson Simão
 * @since 1.0
 */

public interface PetRepository extends CrudRepository<Pet, Long> {
}
