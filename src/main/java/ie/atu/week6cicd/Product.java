package ie.atu.week6cicd;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {


    @PositiveOrZero(message ="Id Must be greater than 0")
    private int id;

    @NotBlank(message ="Name field cannot be blank")
    private String name;

    @Min(value=1, message  = "Price Must be greater than 1")
    private double price;


}
