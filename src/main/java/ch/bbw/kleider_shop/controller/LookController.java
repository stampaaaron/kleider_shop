package ch.bbw.kleider_shop.controller;

import ch.bbw.kleider_shop.dbo.Look;
import ch.bbw.kleider_shop.facade.LookFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/look")
public class LookController {

    @Autowired
    private LookFacade lookFacade;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Optional<Look> getLookByID(@PathVariable("id") int id) {
        return lookFacade.getLookById(id);
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Look> getAllLooks() {
        return lookFacade.getAllLooks();
    }

}
