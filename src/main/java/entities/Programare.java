package entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Programare")
public class Programare {
    @Id
    @GeneratedValue
    private Long id;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "Id")
    @Column
    private List<Serviciu> servicii;

    @OneToOne
    @Column
    private Client client;

    @Column
    private LocalDate dataProgramare;
}
