package ch.bbw.kleider_shop.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.List;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class OrderItemRequest {

    private String firstName;
    private String lastName;
    private String street;
    private String plz;
    private List<ClothesOrderItem> clothesOrderItems;

}
