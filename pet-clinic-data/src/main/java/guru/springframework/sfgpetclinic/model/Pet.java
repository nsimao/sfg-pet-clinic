package guru.springframework.sfgpetclinic.model;

import java.time.LocalDate;

/**
 * @author Nelson Simão
 * @since 1.0
 */

public class Pet extends BaseEntity {
// ------------------------------ FIELDS ------------------------------

    private String name;
    private PetType petType;
    private Owner owner;
    private LocalDate birthDate;

// --------------------- GETTER / SETTER METHODS ---------------------

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public PetType getPetType() {
        return petType;
    }

    public void setPetType(PetType petType) {
        this.petType = petType;
    }
}
