package guru.springframework.sfgpetclinic.formatters;

import guru.springframework.sfgpetclinic.model.PetType;
import guru.springframework.sfgpetclinic.services.PetTypeService;
import org.springframework.format.Formatter;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.util.Collection;
import java.util.Locale;

/**
 * @author Nelson Simão
 * @since 1.0
 */
@Component
public class PetTypeFormatter implements Formatter<PetType> {
// ------------------------------ FIELDS ------------------------------

    private final PetTypeService petTypeService;

// --------------------------- CONSTRUCTORS ---------------------------

    public PetTypeFormatter(PetTypeService petTypeService) {
        this.petTypeService = petTypeService;
    }

// ------------------------ INTERFACE METHODS ------------------------


// --------------------- Interface Parser ---------------------


    @Override
    public PetType parse(String text, Locale locale) throws ParseException {
        Collection<PetType> findPetTypes = petTypeService.findAll();

        for (PetType type : findPetTypes) {
            if (type.getName().equals(text)) {
                return type;
            }
        }

        throw new ParseException("type not found: " + text, 0);
    }

// --------------------- Interface Printer ---------------------

    @Override
    public String print(PetType petType, Locale locale) {
        return petType.getName();
    }
}
