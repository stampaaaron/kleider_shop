package ch.bbw.kleider_shop.dbo;

import lombok.*;

import javax.persistence.*;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Table(name = "look_category")
public class LookCategory {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;

    @Column(name = "category")
    private String category;

}
