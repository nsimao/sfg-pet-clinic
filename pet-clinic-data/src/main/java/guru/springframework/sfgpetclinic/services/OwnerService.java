package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.model.Owner;

import java.util.List;

/**
 * @author Nelson Simão
 * @since 1.0
 */

public interface OwnerService extends CrudService<Owner, Long> {
// -------------------------- OTHER METHODS --------------------------

    Owner findByLastName(String lastName);

    List<Owner> findAllByLastNameLike(String lastName);
}
