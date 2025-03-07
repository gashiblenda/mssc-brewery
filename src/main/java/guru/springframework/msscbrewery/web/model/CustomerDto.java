package guru.springframework.msscbrewery.web.model;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;
@Data
@NoArgsConstructor
@Builder

public class CustomerDto {

    private UUID customerId;

    @NotBlank
    @Size(min =3, max = 100)
    private String customerName;

    public CustomerDto(UUID customerId, String customerName){
        this.customerId = customerId;
        this.customerName = customerName;
    }
}
