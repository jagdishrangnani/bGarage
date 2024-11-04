package com.bgarage.PartsInventory.model;

import com.bgarage.PartsInventory.enums.SparePartsType;
import jakarta.persistence.*;

import java.util.Date;

@Entity
public class SparePart {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String partNumber;
    private String partName;
    private String partDescription;
    private SparePartsType partType;
    private Integer quantity;
    private Double price;
    private String manufacturedBy;
    private Date manufactureDate;
    @ManyToOne
    private PartsSupplier partsSupplier;
    private Integer quantityThresholdLimit;
    private Integer minimumOrderQuantity;
    private String createdBy;
    private Date createdDate;
    private String updatedBy;
    private Date updatedDate;

    private SparePart(String partNumber, String partName, String partDescription, SparePartsType partType, Integer quantity, Double price, String manufacturedBy, Date manufactureDate, PartsSupplier partsSupplier, Integer quantityThresholdLimit, Integer minimumOrderQuantity, String createdBy, Date createdDate, String updatedBy, Date updatedDate) {

        this.partNumber = partNumber;
        this.partName = partName;
        this.partDescription = partDescription;
        this.partType = partType;
        this.quantity = quantity;
        this.price = price;
        this.manufacturedBy = manufacturedBy;
        this.manufactureDate = manufactureDate;
        this.partsSupplier = partsSupplier;
        this.quantityThresholdLimit = quantityThresholdLimit;
        this.minimumOrderQuantity = minimumOrderQuantity;
        this.createdBy = createdBy;
        this.createdDate = createdDate;
        this.updatedBy = updatedBy;
        this.updatedDate = updatedDate;
    }


    public Long getId() {
        return id;
    }

    public String getPartNumber() {
        return partNumber;
    }

    public String getPartName() {
        return partName;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public PartsSupplier getPartsSupplier() {
        return partsSupplier;
    }

    public SparePartsType getPartType() {
        return partType;
    }

    public Date getUpdatedDate() {
        return updatedDate;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public Double getPrice() {
        return price;
    }

    public String getManufacturedBy() {
        return manufacturedBy;
    }

    public Date getManufactureDate() {
        return manufactureDate;
    }


    public Integer getQuantityThresholdLimit() {
        return quantityThresholdLimit;
    }



    public Integer getMinimumOrderQuantity() {
        return minimumOrderQuantity;
    }



    public String getCreatedBy() {
        return createdBy;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public Date getUpdatedDateDate() {
        return updatedDate;
    }

    private SparePart(SparePartBuilder builder) {
        this.partNumber=builder.partNumber;
        this.partName=builder.partName;
        this.partType=builder.partType;
        this.quantity=builder.quantity;
        this.quantityThresholdLimit=builder.quantityThresholdLimit;
        this.minimumOrderQuantity=builder.minimumOrderQuantity;
        this.createdBy=builder.createdBy;
        this.createdDate=builder.createdDate;
        this.updatedBy=builder.updatedBy;
        this.updatedDate=builder.updatedDate;
        this.partsSupplier=builder.partsSupplier;

    }

    public static class SparePartBuilder{
        private Long id;
        private String partNumber;
        private String partName;
        private String partDescription;
        private SparePartsType partType;
        private Integer quantity;
        private Double price;
        private String manufacturedBy;
        private Date manufactureDate;
        private PartsSupplier partsSupplier;
        private Integer quantityThresholdLimit;
        private Integer minimumOrderQuantity;
        private String createdBy;
        private Date createdDate;
        private String updatedBy;
        private Date updatedDate;

        public SparePartBuilder(){

        }

        public SparePartBuilder(String partNumber, String partName, String partDescription, SparePartsType partType, Integer quantity, Double price, String manufacturedBy, Date manufactureDate, PartsSupplier partsSupplier, Integer quantityThresholdLimit, Integer minimumOrderQuantity, String createdBy, Date createdDate, String updatedBy, Date updatedDate) {

            this.partNumber = partNumber;
            this.partName = partName;
            this.partDescription = partDescription;
            this.partType = partType;
            this.quantity = quantity;
            this.price = price;
            this.manufacturedBy = manufacturedBy;
            this.manufactureDate = manufactureDate;
            this.partsSupplier = partsSupplier;
            this.quantityThresholdLimit = quantityThresholdLimit;
            this.minimumOrderQuantity = minimumOrderQuantity;
            this.createdBy = createdBy;
            this.createdDate = createdDate;
            this.updatedBy = updatedBy;
            this.updatedDate = updatedDate;
        }

        public SparePartBuilder setId(Long id) {
            this.id = id;
            return this;
        }

        public SparePartBuilder setPartNumber(String partNumber) {
            this.partNumber = partNumber;
            return this;
        }

        public SparePartBuilder setPartName(String partName) {
            this.partName = partName;
            return this;
        }

        public SparePartBuilder setPartDescription(String partDescription) {
            this.partDescription = partDescription;
            return this;
        }

        public SparePartBuilder setPartType(SparePartsType partType) {
            this.partType = partType;
            return this;
        }

        public SparePartBuilder setQuantity(Integer quantity) {
            this.quantity = quantity;
            return this;
        }

        public SparePartBuilder setPrice(Double price) {
            this.price = price;
            return this;
        }

        public SparePartBuilder setManufacturedBy(String manufacturedBy) {
            this.manufacturedBy = manufacturedBy;
            return this;
        }

        public SparePartBuilder setManufactureDate(Date manufactureDate) {
            this.manufactureDate = manufactureDate;
            return this;
        }

        public SparePartBuilder setPartsSupplier(PartsSupplier partsSupplier) {
            this.partsSupplier = partsSupplier;
            return this;
        }

        public SparePartBuilder setQuantityThresholdLimit(Integer quantityThresholdLimit) {
            this.quantityThresholdLimit = quantityThresholdLimit;
            return this;
        }

        public SparePartBuilder setMinimumOrderQuantity(Integer minimumOrderQuantity) {
            this.minimumOrderQuantity = minimumOrderQuantity;
            return this;
        }

        public SparePartBuilder setCreatedBy(String createdBy) {
            this.createdBy = createdBy;
            return this;
        }

        public SparePartBuilder setCreatedDate(Date createdDate) {
            this.createdDate = createdDate;
            return this;
        }

        public SparePartBuilder setUpdatedBy(String updatedBy) {
            this.updatedBy = updatedBy;
            return this;
        }

        public SparePartBuilder setUpdatedDate(Date updatedDate) {
            this.updatedDate = updatedDate;
            return this;
        }

        public SparePart build(){
            return new SparePart(this);
        }

    }
}
