package com.bgarage.OrderService.message;

import com.bgarage.PartsInventory.enums.SparePartsType;
import com.bgarage.PartsInventory.model.PartsSupplier;

public class OrderSparePartEvent {

    private String partNumber;
    private String partName;
    private String partDescription;
    private SparePartsType partType;
    private Integer quantity;
    private PartsSupplier partSupplier;

    public OrderSparePartEvent(String partNumber, String partName, String partDescription, SparePartsType partType, Integer quantity, PartsSupplier partSupplier) {
        this.partNumber = partNumber;
        this.partName = partName;
        this.partDescription = partDescription;
        this.partType = partType;
        this.quantity = quantity;
        this.partSupplier = partSupplier;
    }

    public String getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public String getPartName() {
        return partName;
    }

    public void setPartName(String partName) {
        this.partName = partName;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }

    public SparePartsType getPartType() {
        return partType;
    }

    public void setPartType(SparePartsType partType) {
        this.partType = partType;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
