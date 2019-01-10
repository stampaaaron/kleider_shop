package ch.bbw.kleider_shop.controller;

import ch.bbw.kleider_shop.dbo.Clothes;
import ch.bbw.kleider_shop.facade.ClothesFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/clothes")
public class ClothesController {

    @Autowired
    private ClothesFacade clothesFacade;

    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping(method = RequestMethod.GET)
    public List<Clothes> getAllClothes() {
        return clothesFacade.getAllClothes();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Optional<Clothes> getClothesById(@PathVariable("id") int id) {
        return clothesFacade.findClothesById(id);
    }

}
