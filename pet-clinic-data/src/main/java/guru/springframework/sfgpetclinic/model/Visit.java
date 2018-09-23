package guru.springframework.sfgpetclinic.model;

import java.time.LocalDate;

/**
 * @author Nelson Simão
 * @since 1.0
 */

public class Visit extends BaseEntity {
// ------------------------------ FIELDS ------------------------------

    private LocalDate date;
    private String description;
    private Pet pet;

// --------------------- GETTER / SETTER METHODS ---------------------

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }
}