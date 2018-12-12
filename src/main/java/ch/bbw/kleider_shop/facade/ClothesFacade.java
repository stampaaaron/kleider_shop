package ch.bbw.kleider_shop.facade;

import ch.bbw.kleider_shop.dbo.Clothes;
import ch.bbw.kleider_shop.repository.ClothesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClothesFacade {

    @Autowired
    private ClothesRepository clothesRepo;

    public Optional<Clothes> findClothesById(int id) {
        Optional<Clothes> clothes = clothesRepo.findById(id);
        return clothes;
    }

    public List<Clothes> getAllClothes() {
        return clothesRepo.findAll();
    }
}
