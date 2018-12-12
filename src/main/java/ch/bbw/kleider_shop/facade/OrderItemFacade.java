package ch.bbw.kleider_shop.facade;

import ch.bbw.kleider_shop.converter.OrderItemRequestToOrderItemConverter;
import ch.bbw.kleider_shop.converter.OrderItemToOrderItemResponsConverter;
import ch.bbw.kleider_shop.model.OrderItemRequest;
import ch.bbw.kleider_shop.model.OrderItemRespons;
import ch.bbw.kleider_shop.repository.OrderItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderItemFacade {

    @Autowired
    OrderItemRepository orderRepo;

    public void insertOrder(OrderItemRequest orderItemRequest) {
        this.orderRepo.save(OrderItemRequestToOrderItemConverter.convert(orderItemRequest));
    }

    public List<OrderItemRespons> getAllOrders() {
        return OrderItemToOrderItemResponsConverter.convert(this.orderRepo.findAll());
    }

    public void deleteOrderById(int id) {
        this.orderRepo.deleteById(id);
    }
}
