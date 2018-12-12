package ch.bbw.kleider_shop.model;

import ch.bbw.kleider_shop.dbo.Clothes;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ClothesOrderItem {

    private Clothes clothes;
    private int count;

    public void incraseCount(int amount) {
        this.count += amount;
    }

}
