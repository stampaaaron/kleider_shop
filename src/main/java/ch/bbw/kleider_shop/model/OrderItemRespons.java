package ch.bbw.kleider_shop.model;

import lombok.*;

import java.util.List;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class OrderItemRespons {

    private int id;
    private String firstName;
    private String lastName;
    private String street;
    private String plz;
    private List<ClothesOrderItem> clothesOrderItems;

}
