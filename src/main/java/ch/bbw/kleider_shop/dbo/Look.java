package ch.bbw.kleider_shop.dbo;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Look {

    @Id
    @Column(name = "id")
    private long id;

    @ManyToOne
    @JoinColumn(name = "model_id", referencedColumnName = "id")
    private Model model;

    @ManyToOne
    @JoinColumn(name = "category_id", referencedColumnName = "id")
    private LookCategory lookCategory;

    @Column(name = "name")
    private String name;

    @ManyToMany
    private List<Clothes> clothes;

}
