package guru.springframework.sfgpetclinic.repositories;

import guru.springframework.sfgpetclinic.model.Visit;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Nelson Simão
 * @since 1.0
 */
public interface VisitRepository extends CrudRepository<Visit, Long> {
}
