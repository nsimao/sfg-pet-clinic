package guru.springframework.sfgpetclinic.services.springdatajpa;

import guru.springframework.sfgpetclinic.model.Owner;
import guru.springframework.sfgpetclinic.repositories.OwnerRepository;
import guru.springframework.sfgpetclinic.repositories.PetRepository;
import guru.springframework.sfgpetclinic.repositories.PetTypeRepository;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.mockito.Mock;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.*;

/**
 * @author Nelson Simão
 * @since 1.0
 */

public class OwnerSDJpaServiceTest {
// ------------------------------ FIELDS ------------------------------

    public static final String LAST_NAME = "Smith";
    @Mock
    public OwnerRepository ownerRepository;
    @Mock
    public PetRepository petRepository;
    @Mock
    public PetTypeRepository petTypeRepository;
    public OwnerSDJpaService ownerSDJpaService;
    private Owner returnOwner;

// -------------------------- OTHER METHODS --------------------------

    private Owner createOwner(Long id, String lastName) {
        Owner owner = new Owner();
        owner.setId(id);
        owner.setLastName(lastName);
        return owner;
    }

    @Ignore
    @Test
    public void delete() {
        ownerSDJpaService.delete(returnOwner);
        //default is 1 times
        verify(ownerRepository, times(1)).delete(any());
    }

    @Ignore
    @Test
    public void deleteById() {
        ownerSDJpaService.deleteById(1L);
        verify(ownerRepository).deleteById(anyLong());
    }

    @Ignore
    @Test
    public void findAll() {
        Set<Owner> returnOwnersSet = new HashSet<>();
        returnOwnersSet.add(createOwner(1l));
        returnOwnersSet.add(createOwner(2l));
        when(ownerRepository.findAll()).thenReturn(returnOwnersSet);
        Set<Owner> owners = ownerSDJpaService.findAll();
        assertNotNull(owners);
        assertEquals(2, owners.size());
    }

    private Owner createOwner(Long id) {
        Owner owner = new Owner();
        owner.setId(id);
        return owner;
    }

    @Ignore
    @Test
    public void findById() {
        when(ownerRepository.findById(anyLong())).thenReturn(Optional.of(returnOwner));
        Owner owner = ownerSDJpaService.findById(1L);
        assertNotNull(owner);
    }

    @Ignore
    @Test
    public void findByIdNotFound() {
        when(ownerRepository.findById(anyLong())).thenReturn(Optional.empty());
        Owner owner = ownerSDJpaService.findById(1L);
        assertNull(owner);
    }

    @Ignore
    @Test
    public void findByLastName() {
        when(ownerRepository.findByLastName(any())).thenReturn(returnOwner);
        Owner smith = ownerSDJpaService.findByLastName(LAST_NAME);
        assertEquals(LAST_NAME, smith.getLastName());
        verify(ownerRepository).findByLastName(any());
    }

    @Ignore
    @Test
    public void save() {
        Owner ownerToSave = createOwner(1L);
        when(ownerRepository.save(any())).thenReturn(returnOwner);
        Owner savedOwner = ownerSDJpaService.save(ownerToSave);
        assertNotNull(savedOwner);
        verify(ownerRepository).save(any());
    }

    @Before
    public void setUp() {
//        MockitoAnnotations.initMocks(this);
//        returnOwner = createOwner(1L, LAST_NAME);
//        ownerSDJpaService = new OwnerSDJpaService(ownerRepository, petRepository, petTypeRepository);
    }
}