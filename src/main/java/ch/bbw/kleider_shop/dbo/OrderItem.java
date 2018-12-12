package ch.bbw.kleider_shop.dbo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Table(name = "order_item")
public class OrderItem {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "street")
    private String street;

    @Column(name = "plz")
    private String plz;

//    @OneToMany(mappedBy = "orderItem")
//    private List<ClothesOrder> clothesOrders;

    @ManyToMany
    @JoinTable(name = "clothes_order",
            joinColumns = {@JoinColumn(name = "order_id")}, inverseJoinColumns = {@JoinColumn(name = "clothes_id")})
    private List<Clothes> clothes;
}
