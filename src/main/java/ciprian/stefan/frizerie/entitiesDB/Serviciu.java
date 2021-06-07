package ciprian.stefan.frizerie.entitiesDB;

import lombok.Getter;

import javax.persistence.*;

@Getter
@Entity
@Table(name = "serviciu", schema = "frizerie")
public class Serviciu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column
    private Integer pret;

    @Column
    private String moneda;

}
