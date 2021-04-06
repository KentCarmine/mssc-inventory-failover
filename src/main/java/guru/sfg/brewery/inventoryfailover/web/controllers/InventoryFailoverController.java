package guru.sfg.brewery.inventoryfailover.web.controllers;

import guru.sfg.brewery.model.BeerInventoryDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by jt on 2019-05-31.
 */
@Slf4j
@RequiredArgsConstructor
@RestController
public class InventoryFailoverController {

    @GetMapping("/inventory-failover")
    List<BeerInventoryDto> listInventory() {

        BeerInventoryDto dto = BeerInventoryDto.builder()
                .id(UUID.randomUUID())
                .beerId(UUID.fromString("00000000-0000-0000-0000-000000000000"))
                .quantityOnHand(999)
                .createdDate(OffsetDateTime.now())
                .lastModifiedDate(OffsetDateTime.now())
                .build();

        List<BeerInventoryDto> list = new ArrayList<>();
        list.add(dto);

        return list;
    }


}
