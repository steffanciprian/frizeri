package ciprian.stefan.frizerie.entitiesDB;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "calendar", schema = "frizerie")
public class Calendar {

    @Id
    @GeneratedValue
    private Long id;

    @ManyToMany
    @Column
    private List<OraRezervata> oraRezervata;
}
