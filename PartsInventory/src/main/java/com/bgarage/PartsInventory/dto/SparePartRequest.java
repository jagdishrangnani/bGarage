package com.bgarage.PartsInventory.dto;

import jakarta.validation.constraints.*;

import java.util.Date;

public class SparePartRequest {

    private Long id;

    @NotEmpty(message = "Partnumber may not be empty")
    private String partNumber;
    @NotEmpty(message = "PartName cannot be empty")
    private String partName;
    private String partDescription;
    @NotNull
    private String partType;

    @PositiveOrZero(message = "Quantity cannot be below zero")
    private Integer quantity;
    @NotNull
    @PositiveOrZero(message = "Price cannot be below zero")
    private Double price;
    @NotNull
    private String manufacturedBy;
    @NotNull
    private Date manufactureDate;

    public SparePartRequest() {

    }

    public SparePartRequest(Long id, String partNumber, String partName, String partDescription, String partType, Integer quantity, Double price, String manufacturedBy, Date manufactureDate) {
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
