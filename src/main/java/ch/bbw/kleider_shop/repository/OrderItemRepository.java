package ch.bbw.kleider_shop.repository;

import ch.bbw.kleider_shop.dbo.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, Integer> {
}
