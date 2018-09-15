package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.model.Owner;

import java.util.Set;

/**
 * @author Nelson Simão
 * @since 1.0
 */

public interface OwnerService {
// -------------------------- OTHER METHODS --------------------------

    Set<Owner> findAll();

    Owner findById(Long id);

    Owner findByLastName(String lastName);

    Owner save(Owner owner);
}
