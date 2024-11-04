package com.bgarage.PartsInventory.service;

import com.bgarage.PartsInventory.controller.SparePartController;
import com.bgarage.PartsInventory.dto.SparePartRequest;
import com.bgarage.PartsInventory.dto.SparePartResponse;
import com.bgarage.PartsInventory.mapper.SparePartMapper;
import com.bgarage.PartsInventory.message.OrderSparePartEvent;
import com.bgarage.PartsInventory.message.publisher.OrderSparePartsPublisher;
import com.bgarage.PartsInventory.model.SparePart;
import com.bgarage.PartsInventory.repository.SparePartRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class SparePartService {

    private static Logger logger = LoggerFactory.getLogger(SparePartController.class);

    private SparePartRepository sparePartRepository;
    private OrderSparePartsPublisher orderSparePartsPublisher;


    public SparePartService(SparePartRepository sparePartRepository) {
        this.sparePartRepository = sparePartRepository;
    }

    public SparePartResponse createSparePart(SparePartRequest sparePartRequest){
       // SparePart sparePart =
        SparePartMapper sparePartMapper = new SparePartMapper();
        SparePart sparePart = sparePartMapper.map(sparePartRequest);
        SparePart sparePartCreated = sparePartRepository.save(sparePart);
        logger.info("Spare Part : {} saved successfully.",sparePart.getId());
        return sparePartMapper.map(sparePartCreated);
    }

    public void updateSparePart(SparePartRequest sparePartRequest){
        // SparePart sparePart =
        SparePartMapper sparePartMapper = new SparePartMapper();
        SparePart sparePart = sparePartMapper.map(sparePartRequest);
        sparePartRepository.save(sparePart);
        logger.info("Spare Part : {} updated successfully.",sparePart.getId());

    }

    public void sellSparePart(SparePartRequest sparePartRequest){
        // SparePart sparePart =
        SparePartMapper sparePartMapper = new SparePartMapper();
        SparePart sparePart = sparePartMapper.map(sparePartRequest);
        sparePartRepository.save(sparePart);
        logger.info("Spare Part : {} updated successfully.",sparePart.getId());
        SparePart sparePartLatest=sparePartRepository.findSparePartByPartNumber(sparePart.getPartNumber());
        if(sparePartLatest.getQuantity() < sparePartLatest.getQuantityThresholdLimit()){
            OrderSparePartEvent orderSparePartEvent = new OrderSparePartEvent(sparePartLatest.getPartNumber(),sparePartLatest.getPartName(),sparePartLatest.getPartDescription(),sparePartLatest.getPartType(),sparePartLatest.getQuantity(),sparePartLatest.getPartsSupplier());
            orderSparePartsPublisher.sendMessage(String.valueOf(orderSparePartEvent));
        }
    }


    public SparePartResponse getSparePart(String sparePartNumber){
        SparePart sparePart = sparePartRepository.findSparePartByPartNumber(sparePartNumber);
        SparePartMapper sparePartMapper = new SparePartMapper();
        SparePartResponse sparePartResponse = sparePartMapper.map(sparePart);
        return sparePartResponse;
    }
}
