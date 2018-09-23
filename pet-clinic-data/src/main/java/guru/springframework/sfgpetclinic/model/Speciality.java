package guru.springframework.sfgpetclinic.model;

/**
 * @author Nelson Simão
 * @since 1.0
 */

public class Speciality extends BaseEntity {
// ------------------------------ FIELDS ------------------------------

    private String description;

// --------------------- GETTER / SETTER METHODS ---------------------

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
