package ch.bbw.kleider_shop.dbo;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Brand {

    @Id
    @Column(name = "id")
    private long id;

    @Column(name = "brand")
    private String brand;

}
