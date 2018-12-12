package ch.bbw.kleider_shop.converter;

import ch.bbw.kleider_shop.dbo.Clothes;
import ch.bbw.kleider_shop.dbo.OrderItem;
import ch.bbw.kleider_shop.model.ClothesOrderItem;
import ch.bbw.kleider_shop.model.OrderItemRespons;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class OrderItemToOrderItemResponsConverter {

    public static OrderItemRespons convert(OrderItem orderItem) {

        Clothes previousClothes = null;
        List<ClothesOrderItem> clothesOrderItems = new ArrayList<>();

        for (Clothes clothes : orderItem.getClothes()){
            if (previousClothes == null || clothes.getId() != previousClothes.getId()) {
                clothesOrderItems.add(new ClothesOrderItem(clothes, 1));
            } else {
                //increase count of last entry by 1
                clothesOrderItems.get(clothesOrderItems.size() -1).incraseCount(1);
            }
            previousClothes = clothes;
        }

        return OrderItemRespons.builder()
                    .id(orderItem.getId())
                    .firstName(orderItem.getFirstName())
                    .lastName(orderItem.getLastName())
                    .street(orderItem.getStreet())
                    .plz(orderItem.getPlz())
                    .clothesOrderItems(clothesOrderItems)
                    .build();
    }

    public static List<OrderItemRespons> convert(List<OrderItem> orderItems) {
        return orderItems.stream().map(OrderItemToOrderItemResponsConverter::convert).collect(Collectors.toList());
    }

}
