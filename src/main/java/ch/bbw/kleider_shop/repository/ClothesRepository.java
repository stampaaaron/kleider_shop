package ch.bbw.kleider_shop.repository;

import ch.bbw.kleider_shop.dbo.Clothes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClothesRepository extends JpaRepository<Clothes, Integer> {
}
