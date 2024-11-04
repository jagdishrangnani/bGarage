package com.bgarage.OrderService.model;

import com.bgarage.PartsInventory.enums.SupplierType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class PartsSupplier {

    @Id
    private Integer id;
    private String name;
    private SupplierType type;
    private String address;
    private String phone;

    public PartsSupplier(String name, SupplierType type, String address, String phone) {
        this.name = name;
        this.type = type;
        this.address = address;
        this.phone = phone;
    }

    public PartsSupplier() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(String id) {
        id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SupplierType getType() {
        return type;
    }

    public void setType(SupplierType type) {
        this.type = type;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
