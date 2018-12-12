package ch.bbw.kleider_shop.controller;

import ch.bbw.kleider_shop.dbo.OrderItem;
import ch.bbw.kleider_shop.facade.OrderItemFacade;
import ch.bbw.kleider_shop.model.OrderItemRequest;
import ch.bbw.kleider_shop.model.OrderItemRespons;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/order")
public class OrderItemController {

    @Autowired
    private OrderItemFacade orderItemFacade;

    @RequestMapping(method = RequestMethod.GET)
    public List<OrderItemRespons> getAllOrders() {
        return orderItemFacade.getAllOrders();
    }

    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void insertOrder(@RequestBody OrderItemRequest orderItemRequest) {
        orderItemFacade.insertOrder(orderItemRequest);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteOrderById(@PathVariable int id) {
        orderItemFacade.deleteOrderById(id);
    }

}
