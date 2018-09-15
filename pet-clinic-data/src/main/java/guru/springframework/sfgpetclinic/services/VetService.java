package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.model.Vet;

import java.util.Set;

/**
 * @author Nelson Simão
 * @since 1.0
 */

public interface VetService {
// -------------------------- OTHER METHODS --------------------------

    Set<Vet> findAll();

    Vet findById(Long id);

    Vet save(Vet owner);
}
