package ch.bbw.kleider_shop.facade;

import ch.bbw.kleider_shop.dbo.Look;
import ch.bbw.kleider_shop.repository.LookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LookFacade {

    @Autowired
    private LookRepository lookRepo;

    public Optional<Look> getLookById(int id) {
        Optional<Look> look = lookRepo.findById(id);
        return look;
    }

    public List<Look> getAllLooks() {
        return lookRepo.findAll();
    }
}
