package guru.springframework.sfgpetclinic.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author Nelson Simão
 * @since 1.0
 */
@Entity
@Table(name = "specialties")
public class Speciality extends BaseEntity {
// ------------------------------ FIELDS ------------------------------

    @Column(name = "description")
    private String description;

// --------------------- GETTER / SETTER METHODS ---------------------

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
