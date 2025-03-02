package guru.springframework.msscbrewery.web.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Null;
import jakarta.validation.constraints.Positive;
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
    @Null(message = "Id should not be null")
    private UUID id;

    @NotBlank(message = "Beer Name is required")
    private String beerName;

    @NotBlank(message = "Beer Style is required")
    private String beerStyle;

    @Positive (message = "UPC should be a positive number")
    private Long upc;



}






