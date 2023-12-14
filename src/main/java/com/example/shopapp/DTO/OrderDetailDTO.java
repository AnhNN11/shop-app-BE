package com.example.shopapp.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Data// toString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OrderDetailDTO {
    private Long orderId;
    private Long productId;
    private Long price;
    private int numberOfProduct;
    @JsonProperty("total_money")
    private int totalMoney;





}
