package ch.bbw.kleider_shop.dbo;

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
@Table(name = "look")
public class Look {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;

    @ManyToOne
    @JoinColumn(name = "model_id", referencedColumnName = "id")
    private Model model;

    @ManyToOne
    @JoinColumn(name = "category_id", referencedColumnName = "id")
    private LookCategory lookCategory;

    @Column(name = "name")
    private String name;

    @ManyToMany(mappedBy = "looks")
    private List<Clothes> clothes = new ArrayList<Clothes>();

    @ManyToMany
    @JoinTable(name = "look_season",
            joinColumns = {@JoinColumn(name = "look_id")}, inverseJoinColumns = {@JoinColumn(name = "season_id")})
    private List<Season> seasons;

}
