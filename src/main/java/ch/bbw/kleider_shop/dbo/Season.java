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
@Table(name = "season")
public class Season {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;

    @Column(name = "season")
    private String season;

    @ManyToMany(mappedBy = "seasons")
    @JsonIgnore
    private List<Clothes> clothes;

    @ManyToMany(mappedBy = "seasons")
    @JsonIgnore
    private List<Look> looks;

}
