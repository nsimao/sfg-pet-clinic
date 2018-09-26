package guru.springframework.sfgpetclinic.repositories;

import guru.springframework.sfgpetclinic.model.Vet;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Nelson Simão
 * @since 1.0
 */
public interface VetRepository extends CrudRepository<Vet, Long> {
}
