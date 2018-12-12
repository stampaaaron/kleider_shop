package ch.bbw.kleider_shop.repository;

import ch.bbw.kleider_shop.dbo.ClothesType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClothesTypeRepository extends JpaRepository<ClothesType, Integer> {
}
