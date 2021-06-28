package ciprian.stefan.frizerie.entitiesDB;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "frizer", schema = "frizerie")
public class Frizer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;

    @Column
    private String name;

    @Column
    private Integer scaun;

    @OneToMany
    @JoinColumn(name = "id")
    private List<OraRezervata> oraRezervata;

}
