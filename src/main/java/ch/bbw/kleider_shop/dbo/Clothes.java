package ch.bbw.kleider_shop.dbo;

import lombok.*;
import org.springframework.data.annotation.Id;

import javax.persistence.*;
import java.util.List;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Clothes {

    @Id
    @Column(name = "id")
    private long id;

    @ManyToOne
    @JoinColumn(name = "clothes_type_id", referencedColumnName = "id")
    private ClothesType clothesType;

    @ManyToOne
    @JoinColumn(name = "brand_id", referencedColumnName = "id")
    private Brand brand;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "price")
    private int price;

    @Column(name = "size")
    private int size;

    @ManyToMany(mappedBy = "clothes")
    private List<Look> looks;

}
