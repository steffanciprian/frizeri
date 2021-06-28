package ciprian.stefan.frizerie.entitiesDB;

import javax.persistence.*;

@Entity
@Table(name = "orarezervata", schema = "frizerie")
public class OraRezervata {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @Column
    private String ora;

    @Column
    private Boolean booked;

    @Column
    private Long frizerId;
}
