package ch.bbw.kleider_shop.repository;

import ch.bbw.kleider_shop.dbo.Season;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SeasonRepository extends JpaRepository<Season, Integer> {
}
