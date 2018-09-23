package guru.springframework.sfgpetclinic.model;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Nelson Simão
 * @since 1.0
 */

public class Vet extends Person {
// ------------------------------ FIELDS ------------------------------

    private Set<Speciality> specialities = new HashSet<>();

// --------------------- GETTER / SETTER METHODS ---------------------

    public Set<Speciality> getSpecialities() {
        return specialities;
    }

    public void setSpecialities(Set<Speciality> specialities) {
        this.specialities = specialities;
    }
}
