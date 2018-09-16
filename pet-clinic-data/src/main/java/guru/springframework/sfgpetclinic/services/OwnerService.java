package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.model.Owner;

/**
 * @author Nelson Simão
 * @since 1.0
 */

public interface OwnerService extends CrudService<Owner, Long> {
// -------------------------- OTHER METHODS --------------------------

    Owner findByLastName(String lastName);
}
