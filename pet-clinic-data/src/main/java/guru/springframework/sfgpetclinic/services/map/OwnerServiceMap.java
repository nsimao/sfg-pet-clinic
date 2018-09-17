package guru.springframework.sfgpetclinic.services.map;

import guru.springframework.sfgpetclinic.model.Owner;
import guru.springframework.sfgpetclinic.services.OwnerService;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * @author Nelson Simão
 * @since 1.0
 */

@Service
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService {
// ------------------------ INTERFACE METHODS ------------------------


// --------------------- Interface CrudService ---------------------

    @Override
    public void delete(Owner object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner save(Owner object) {
        return super.save(object);
    }

// --------------------- Interface OwnerService ---------------------


    @Override
    public Owner findByLastName(String lastName) {
        return null;
    }
}
