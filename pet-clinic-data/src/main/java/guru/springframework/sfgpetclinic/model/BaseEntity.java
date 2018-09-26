package guru.springframework.sfgpetclinic.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;

/**
 * @author Nelson Simão
 * @since 1.0
 */
@MappedSuperclass
public class BaseEntity implements Serializable {
// ------------------------------ FIELDS ------------------------------

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

// --------------------- GETTER / SETTER METHODS ---------------------

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
