package entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Client")
public class Client {

    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String name;

}
