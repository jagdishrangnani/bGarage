package com.bgarage.OrderService.service;

import com.bgarage.OrderService.dto.OrderSparePartsRequest;
import com.bgarage.OrderService.dto.OrderSparePartsResponse;
import com.bgarage.OrderService.mapper.OrderSparePartsMapper;
import com.bgarage.OrderService.model.OrderSpareParts;
import com.bgarage.OrderService.repository.OrderSparePartRepository;

public class OrderSparePartsService {

    public OrderSparePartRepository orderSparePartRepository;

    public OrderSparePartsService(OrderSparePartRepository orderSparePartRepository) {
        this.orderSparePartRepository = orderSparePartRepository;
    }

    public OrderSparePartsResponse placeSparePartsOrder(OrderSparePartsRequest orderSparePartsRequest) {
        OrderSparePartsMapper orderSparePartsMapper = new OrderSparePartsMapper();
       OrderSpareParts orderSpareParts = orderSparePartsMapper.map(orderSparePartsRequest);
        orderSparePartRepository.save(orderSpareParts);
        if(orderSpareParts.getPartType().equals(local)
            System.out.println(placeSparePartsOrder());
    }
}
