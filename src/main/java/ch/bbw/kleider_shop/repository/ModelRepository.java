package ch.bbw.kleider_shop.repository;

import ch.bbw.kleider_shop.dbo.Model;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ModelRepository extends JpaRepository<Model, Integer> {
}
