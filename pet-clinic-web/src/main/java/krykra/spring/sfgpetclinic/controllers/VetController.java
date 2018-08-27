package krykra.spring.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by kk on 8/27/2018.
 */
@RequestMapping("vets")
@Controller
public class VetController {

    @RequestMapping({"", "/", "/index", "/index.html"})
    public String listVets() {
        return "vets/index";
    }
}
