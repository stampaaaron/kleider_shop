package ch.bbw.kleider_shop.repository;

import ch.bbw.kleider_shop.dbo.LookCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LookCategoryRepository extends JpaRepository<LookCategory, Integer> {
}
