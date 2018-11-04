package guru.springframework.sfgpetclinic.services.map;

import guru.springframework.sfgpetclinic.model.Owner;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

/**
 * @author Nelson Simão
 * @since 1.0
 */

public class OwnerMapServiceTest {
// ------------------------------ FIELDS ------------------------------

    OwnerMapService ownerMapService;
    final Long ownerId = 1L;
    final String lastName = "Smith";

// -------------------------- OTHER METHODS --------------------------
    @Ignore
    @Test
    public void delete() {
        ownerMapService.delete(ownerMapService.findById(ownerId));
        assertEquals(0, ownerMapService.findAll().size());
    }

    @Ignore
    @Test
    public void deleteById() {
        ownerMapService.deleteById(ownerId);
        assertEquals(0, ownerMapService.findAll().size());
    }

    @Ignore
    @Test
    public void findAll() {
        Set<Owner> ownerSet = ownerMapService.findAll();
        assertEquals(1, ownerSet.size());
    }


    @Ignore
    @Test
    public void findById() {
        Owner owner = ownerMapService.findById(ownerId);
        assertEquals(ownerId, owner.getId());
    }

    @Ignore
    @Test
    public void findByLastName() {
        Owner smith = ownerMapService.findByLastName(lastName);
        assertNotNull(smith);
        assertEquals(ownerId, smith.getId());
    }

    @Ignore
    @Test
    public void findByLastNameNotFound() {
        Owner smith = ownerMapService.findByLastName("foo");
        assertNull(smith);
    }

    @Ignore
    @Test
    public void saveExistingId() {
        Long id = 2L;
        Owner owner2 = new Owner();
        owner2.setId(id);
        Owner savedOwner = ownerMapService.save(owner2);
        assertEquals(id, savedOwner.getId());
    }

    @Ignore
    @Test
    public void saveNoId() {
        Owner savedOwner = ownerMapService.save(new Owner());
        assertNotNull(savedOwner);
        assertNotNull(savedOwner.getId());
    }

    @Before
    public void setUp() {
//        ownerMapService = new OwnerMapService(new PetTypeMapService(), new PetMapService());
//        Owner owner = new Owner();
//        owner.setId(ownerId);
//        owner.setLastName(lastName);
//        ownerMapService.save(owner);
    }
}