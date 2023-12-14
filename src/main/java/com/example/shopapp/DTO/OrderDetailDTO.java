package com.example.shopapp.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.Min;
import lombok.*;

@Data// toString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OrderDetailDTO {
    @JsonProperty("order_id")
    @Min(value = 1, message = "The orderId must be >0")
    private Long orderId;

    @JsonProperty("product_id")
    @Min(value = 1, message = "The productId must be >0")
    private Long productId;

    @Min(value = 0, message = "The price must be >= 0")
    private Long price;

    @Min(value = 1, message = "The number_of_product must be >0")
    @JsonProperty("number_of_product")
    private int numberOfProduct;

    @JsonProperty("total_money")
    @Min(value = 0, message = "The total_money must be >0")
    private int totalMoney;

    private String color;


}
