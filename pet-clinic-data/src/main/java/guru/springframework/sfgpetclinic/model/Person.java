package guru.springframework.sfgpetclinic.model;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

/**
 * @author Nelson Simão
 * @since 1.0
 */
@MappedSuperclass
public class Person extends BaseEntity {
// ------------------------------ FIELDS ------------------------------

    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;

// --------------------- GETTER / SETTER METHODS ---------------------

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
