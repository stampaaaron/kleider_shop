package ch.bbw.kleider_shop.repository;

import ch.bbw.kleider_shop.dbo.Brand;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BrandRepository extends JpaRepository<Brand, Integer> {
}
