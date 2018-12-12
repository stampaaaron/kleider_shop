package ch.bbw.kleider_shop.dbo;

import lombok.*;

import javax.persistence.*;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Table(name = "brand")
public class Brand {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;

    @Column(name = "brand")
    private String brand;

}
