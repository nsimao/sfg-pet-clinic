package guru.springframework.sfgpetclinic.controllers;

import guru.springframework.sfgpetclinic.model.Owner;
import guru.springframework.sfgpetclinic.services.OwnerService;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.HashSet;
import java.util.Set;

import static org.mockito.Mockito.verifyZeroInteractions;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

/**
 * @author Nelson Simão
 * @since 1.0
 */

public class OwnerControllerTest {
// ------------------------------ FIELDS ------------------------------

    @Mock
    private OwnerService ownerService;

    private OwnerController controller;
    private Set<Owner> owners;
    private MockMvc mockMvc;

// -------------------------- OTHER METHODS --------------------------

    @Test
    public void findOwners() throws Exception {
        mockMvc.perform(get("/owners/find"))
                .andExpect(status().isOk())
                .andExpect(view().name("owners/findOwners"))
                .andExpect(model().attributeExists("owner"));
        verifyZeroInteractions(ownerService);
    }

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        controller = new OwnerController(ownerService);

        owners = new HashSet<>();
        owners.add(getOwner(1l));
        owners.add(getOwner(2l));
        mockMvc = MockMvcBuilders
                .standaloneSetup(controller)
                .build();
    }

    private Owner getOwner(Long id) {
        Owner owner = new Owner();
        owner.setId(id);

        return owner;
    }
}