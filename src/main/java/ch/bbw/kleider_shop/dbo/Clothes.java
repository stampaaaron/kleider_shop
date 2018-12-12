package ch.bbw.kleider_shop.dbo;

import com.fasterxml.jackson.annotation.*;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Table(name = "clothes")
public class Clothes {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;

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

    @ManyToMany
    @JoinTable(name = "clothes_season",
            joinColumns = {@JoinColumn(name = "clothes_id")}, inverseJoinColumns = {@JoinColumn(name = "season_id")})
    private List<Season> seasons;

    @ManyToMany
    @JoinTable(name = "look_clothes",
        joinColumns = {@JoinColumn(name = "clothes_id")},
        inverseJoinColumns = {@JoinColumn(name = "look_id")})
    @JsonIgnore
    private List<Look> looks = new ArrayList<>();

    @ManyToMany(mappedBy = "clothes")
    @JsonIgnore
    private List<OrderItem> orderItems;
}
