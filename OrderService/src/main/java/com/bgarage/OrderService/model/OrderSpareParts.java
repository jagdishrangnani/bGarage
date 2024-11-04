package com.bgarage.OrderService.model;

import java.util.Date;

public class OrderSpareParts {

    private Long orderId;
    private String partNumber;
    private String partName;
    private String partType;
    private Integer quantity;
    private Double price;
    private Date orderDate;
    private String orderStatus;
    private Double tax;
    private Double totalAmount;

    public OrderSpareParts(Long orderId, String partNumber, String partName, String partType, Integer quantity, Double price, Date orderDate, String orderStatus, Double tax, Double totalAmount) {
        this.orderId = orderId;
        this.partNumber = partNumber;
        this.partName = partName;
        this.partType = partType;
        this.quantity = quantity;
        this.price = price;
        this.orderDate = orderDate;
        this.orderStatus = orderStatus;
        this.tax = tax;
        this.totalAmount = totalAmount;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
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

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Double getTax() {
        return tax;
    }

    public void setTax(Double tax) {
        this.tax = tax;
    }

    public Double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }
}
