package ciprian.stefan.frizerie.entitiesDB;

import javax.persistence.*;

@Entity
@Table(name = "orarezervata", schema = "frizerie")
public class OraRezervata {
    @Id
    @GeneratedValue
    private Long id;

    @JoinColumn
    private String ora;

    @JoinColumn
    private Boolean booked;
}
