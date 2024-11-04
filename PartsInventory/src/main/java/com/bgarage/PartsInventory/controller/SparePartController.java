package com.bgarage.PartsInventory.controller;

import com.bgarage.PartsInventory.dto.SparePartRequest;
import com.bgarage.PartsInventory.dto.SparePartResponse;
import com.bgarage.PartsInventory.model.SparePart;
import com.bgarage.PartsInventory.service.SparePartService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/api/sparepart")
public class SparePartController {

    Logger logger = LoggerFactory.getLogger(SparePartController.class);

    private SparePartService sparePartService;

    public SparePartController(SparePartService sparePartService) {
        this.sparePartService = sparePartService;
    }

    @PostMapping
    public ResponseEntity<SparePartResponse> addSpareParts(@RequestBody SparePartRequest sparePartRequest){
        logger.info("Request received to add spare parts");
        SparePartResponse sparePartResponse = sparePartService.createSparePart(sparePartRequest);
        return new ResponseEntity(sparePartResponse, HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<SparePartResponse> updateSpareParts(@RequestBody SparePartRequest sparePartRequest){
        logger.info("Request received to update spare parts");
        SparePartResponse sparePartResponse = sparePartService.createSparePart(sparePartRequest);
        return new ResponseEntity(sparePartResponse, HttpStatus.OK);

    }

    @PostMapping("/sell")
    public void sellSpareParts(@RequestBody SparePartRequest sparePartRequest){
        logger.info("Request received to sell spare parts");
        sparePartService.createSparePart(sparePartRequest);
    }

    @GetMapping("/{partNumber}")
    public ResponseEntity<SparePartResponse> getSparePart(@PathVariable String partNumber){
        logger.info("Request received to get spare part");

        SparePartResponse sparePartResponse=sparePartService.getSparePart(partNumber);
        return ResponseEntity.ok(sparePartResponse);
    }


}
