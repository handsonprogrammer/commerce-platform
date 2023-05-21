package commerce.platform.orderservice.dto;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderLineItemsDto {
    public Long id;
    private String skuCode;
    private BigDecimal price;
    private Integer quantity;
}
