package ciprian.stefan.frizerie.entitiesDB;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "programare", schema = "frizerie")
public class Programare {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @DateTimeFormat
    @Column
    private LocalDate dataInceput;

    @DateTimeFormat
    @Column
    private LocalDate dataSfarsit;

    @ManyToOne
    @JoinColumn(name = "id_frizer")
    private Frizer frizerId;

    @ManyToOne
    @JoinColumn(name = "id_serviciu")
    private Serviciu serviciuId;


}
