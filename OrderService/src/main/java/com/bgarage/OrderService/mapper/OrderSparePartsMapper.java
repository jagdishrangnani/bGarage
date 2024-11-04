package com.bgarage.OrderService.mapper;

import com.bgarage.OrderService.dto.OrderSparePartsRequest;
import com.bgarage.OrderService.model.OrderSpareParts;

public class OrderSparePartsMapper {

    public OrderSpareParts map(OrderSparePartsRequest orderSparePartRequest){
        OrderSpareParts orderSpareParts = new OrderSpareParts();
        return orderSpareParts;
    }
}
