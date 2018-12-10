package ch.bbw.kleider_shop.dbo;

import lombok.*;
import org.springframework.data.annotation.Id;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class ClothesType {

    @Id
    @Column(name = "id")
    private long id;

    @Column(name = "type")
    private String type;

}
