package guru.springframework.msscbrewery.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class BeerDto {
    private UUID id;
    private String beerName;
    private String beerStyle;
    private Long upc;

    private BeerDto(UUID id, String beerName, String beerStyle, Long upc) {
        this.id = id;
        this.beerName = beerName;
        this.beerStyle = beerStyle;
        this.upc = upc;
    }


}

