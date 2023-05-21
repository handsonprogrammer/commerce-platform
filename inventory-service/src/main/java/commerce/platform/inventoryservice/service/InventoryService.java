package commerce.platform.inventoryservice.service;

import commerce.platform.inventoryservice.dto.InventoryResponse;
import commerce.platform.inventoryservice.repository.InventoryRepository;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class InventoryService {

    private final InventoryRepository inventoryRepository;

    @Transactional(readOnly = true)
    public List<InventoryResponse> isInStock(List<String> skuCodes){
        return inventoryRepository.findBySkuCodeIn(skuCodes)
                                  .stream().map(inventory ->
                                    InventoryResponse.builder()
                                                    .skuCode(inventory.getSkuCode())
                                                    .isInStock(inventory.getQuantity()>0)
                                                    .build()).toList();
    }
    
}
