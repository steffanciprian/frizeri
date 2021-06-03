package ciprian.stefan.frizerie.entitiesDB;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Programare")
public class Programare {
    @Id
    @GeneratedValue
    private Long id;

    @Column
    private LocalDate dataProgramare;
}
