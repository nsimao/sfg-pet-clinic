package guru.springframework.sfgpetclinic.controllers;

import guru.springframework.sfgpetclinic.services.VetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Nelson Simão
 * @since 1.0
 */

@Controller
public class VetController {
// ------------------------------ FIELDS ------------------------------

    private final VetService vetService;

// --------------------------- CONSTRUCTORS ---------------------------

    @Autowired
    public VetController(VetService vetService) {
        this.vetService = vetService;
    }

// -------------------------- OTHER METHODS --------------------------

    @RequestMapping({"/vets", "/vets/index", "/vets/index.html", "/vets.html"})
    public String listVets(Model model) {
        model.addAttribute("vets", vetService.findAll());
        return "vets/index";
    }
}
