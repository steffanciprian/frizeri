package ciprian.stefan.frizerie.entitiesDB;

import javax.persistence.*;
import java.time.LocalTime;

@Entity
@Table(name = "OraRezervata", schema = "frizerie")
public class OraRezervata {
    @Id
    @GeneratedValue
    private Long id;

    @Column
    private LocalTime ora;

    @Column
    private Boolean booked;
}
