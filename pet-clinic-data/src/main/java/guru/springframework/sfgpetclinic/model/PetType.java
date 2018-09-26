package guru.springframework.sfgpetclinic.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author Nelson Simão
 * @since 1.0
 */
@Entity
@Table(name = "types")
public class PetType extends BaseEntity {
// ------------------------------ FIELDS ------------------------------

    @Column(name = "name")
    private String name;

// --------------------- GETTER / SETTER METHODS ---------------------

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
