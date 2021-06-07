package ciprian.stefan.frizerie.DTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
@Builder
public class ServiciuNumeSiPretDTO {
    private String nume;
    private Integer pret;
}
