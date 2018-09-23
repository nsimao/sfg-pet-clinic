package guru.springframework.sfgpetclinic.model;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Nelson Simão
 * @since 1.0
 */

public class Owner extends Person {
// ------------------------------ FIELDS ------------------------------

    private String address;
    private String city;
    private String telephone;
    private Set<Pet> pets = new HashSet<>();

// --------------------- GETTER / SETTER METHODS ---------------------

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Set<Pet> getPets() {
        return pets;
    }

    public void setPets(Set<Pet> pets) {
        this.pets = pets;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
}
