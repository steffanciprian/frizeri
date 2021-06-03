package ciprian.stefan.frizerie.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Component

public class FrizerDTO {
    private Long id;
    private String name;
    private Integer scaun;
}
