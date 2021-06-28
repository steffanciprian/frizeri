package ciprian.stefan.frizerie.entitiesDB;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "programare", schema = "frizerie")
public class Programare {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private LocalDate dataProgramare;

    @ManyToOne
    @JoinColumn
    private Frizer frizer;

    @ManyToOne
    @JoinColumn
    private Serviciu serviciu;

}
