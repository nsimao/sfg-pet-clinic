package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.model.Pet;

import java.util.Set;

/**
 * @author Nelson Simão
 * @since 1.0
 */

public interface PetService {
// -------------------------- OTHER METHODS --------------------------

    Set<Pet> findAll();

    Pet findById(Long id);

    Pet save(Pet owner);
}
