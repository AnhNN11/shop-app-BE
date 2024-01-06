package com.example.shopapp.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Size;
import lombok.*;

@Data//toString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProductImageDTO {
    @JsonProperty (" product_id")
    @Min(value = 1,message = "Product's ID must be > 0")
    private Long productId;

    @Size(min = 5, max = 200,message = "Image Name must be between 3 and 200 characters")
    @JsonProperty ("image_url")
    private String imageUrl;



}
