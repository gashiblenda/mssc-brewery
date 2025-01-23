package guru.springframework.msscbrewery.web.model;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

public class BeerDtoTest {
    public static void main(String[] args) {
        BeerDto beerDto = BeerDto.builder()
                .id(UUID.randomUUID())
                .beerName("Galaxy Cat")
                .beerStyle("Pale Ale")
                .upc(123456789L)
                .build();
        System.out.println(beerDto);
    }
}
