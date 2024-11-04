package com.bgarage.PartsInventory.dto;

import java.util.Date;

public class SparePartResponse {

    private Long id;
    private String partNumber;
    private String partName;
    private String partDescription;
    private String partType;
    private Integer quantity;
    private Double price;
    private String manufacturedBy;
    private Date manufactureDate;

    public SparePartResponse() {

    }

    public SparePartResponse(Long id, String partNumber, String partName, String partDescription, String partType, Integer quantity, Double price, String manufacturedBy, Date manufactureDate) {
        this.id = id;
        this.partNumber = partNumber;
        this.partName = partName;
        this.partDescription = partDescription;
        this.partType = partType;
        this.quantity = quantity;
        this.price = price;
        this.manufacturedBy = manufacturedBy;
        this.manufactureDate = manufactureDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getPartType() {
        return partType;
    }

    public void setPartType(String partType) {
        this.partType = partType;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getManufacturedBy() {
        return manufacturedBy;
    }

    public void setManufacturedBy(String manufacturedBy) {
        this.manufacturedBy = manufacturedBy;
    }

    public Date getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(Date manufactureDate) {
        this.manufactureDate = manufactureDate;
    }
}
