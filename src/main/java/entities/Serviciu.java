package entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Serviciu")
public class Serviciu {
    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String serviciu;

}
