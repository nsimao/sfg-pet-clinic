package guru.springframework.sfgpetclinic.model;

/**
 * @author Nelson Simão
 * @since 1.0
 */

public class Person extends BaseEntity {
// ------------------------------ FIELDS ------------------------------

    private String firstName;
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
