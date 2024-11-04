package com.bgarage.PartsInventory.mapper;

import com.bgarage.PartsInventory.dto.SparePartRequest;
import com.bgarage.PartsInventory.dto.SparePartResponse;
import com.bgarage.PartsInventory.enums.SparePartsType;
import com.bgarage.PartsInventory.model.SparePart;

public class SparePartMapper {

    public SparePart map(SparePartRequest sparePartRequest){
        SparePart.SparePartBuilder sparePartBuilder =
                new SparePart.SparePartBuilder()
                        .setPartNumber(sparePartRequest.getPartNumber())
                        .setPartName(sparePartRequest.getPartName())
                        .setPartDescription(sparePartRequest.getPartDescription())
                        .setPartType(SparePartsType.valueOf(sparePartRequest.getPartType()))
                        .setPrice(sparePartRequest.getPrice())
                        .setQuantity(sparePartRequest.getQuantity());

        return sparePartBuilder.build();
    }

    public SparePartRequest mapFrom(SparePart sparePart){
        SparePartRequest sparePartRequest = new SparePartRequest();
        sparePartRequest.setPartNumber(sparePart.getPartNumber());
        sparePartRequest.setPartName(sparePart.getPartName());
        sparePartRequest.setPartDescription(sparePart.getPartDescription());

        return sparePartRequest;
    }

    public SparePartResponse map(SparePart sparePart){
        SparePartResponse sparePartResponse = new SparePartResponse();
        sparePartResponse.setPartNumber(sparePart.getPartNumber());
        sparePartResponse.setPartName(sparePart.getPartName());
        sparePartResponse.setPartDescription(sparePart.getPartDescription());

        return sparePartResponse;
    }
}
