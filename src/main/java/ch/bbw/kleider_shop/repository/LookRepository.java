package ch.bbw.kleider_shop.repository;

import ch.bbw.kleider_shop.dbo.Look;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LookRepository extends JpaRepository<Look, Integer> {
}
