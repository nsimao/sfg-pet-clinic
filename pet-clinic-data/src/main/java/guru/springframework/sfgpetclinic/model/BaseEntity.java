package guru.springframework.sfgpetclinic.model;

import java.io.Serializable;

/**
 * @author Nelson Simão
 * @since 1.0
 */

public class BaseEntity implements Serializable {
// ------------------------------ FIELDS ------------------------------

    private Long id;

// --------------------- GETTER / SETTER METHODS ---------------------

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
