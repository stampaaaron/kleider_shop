package ch.bbw.kleider_shop.converter;

import ch.bbw.kleider_shop.dbo.Clothes;
import ch.bbw.kleider_shop.dbo.OrderItem;
import ch.bbw.kleider_shop.model.ClothesOrderItem;
import ch.bbw.kleider_shop.model.OrderItemRequest;
import ch.bbw.kleider_shop.model.OrderItemRespons;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class OrderItemRequestToOrderItemConverter {

    public static OrderItem convert(OrderItemRequest orderItemRequest) {

        Clothes previousClothes = null;
        List<Clothes> clothesList = new ArrayList<>();

        for (ClothesOrderItem clothesOrderItem : orderItemRequest.getClothesOrderItems()){
            for(int i = 0; i > clothesOrderItem.getCount(); i++) {
                clothesList.add(clothesOrderItem.getClothes());
            }
        }

        return OrderItem.builder()
                    .firstName(orderItemRequest.getFirstName())
                    .lastName(orderItemRequest.getLastName())
                    .street(orderItemRequest.getStreet())
                    .plz(orderItemRequest.getPlz())
                    .clothes(clothesList)
                    .build();
    }

    public static List<OrderItem> convert(List<OrderItemRequest> orderItemRequests) {
        return orderItemRequests.stream().map(OrderItemRequestToOrderItemConverter::convert).collect(Collectors.toList());
    }

}
