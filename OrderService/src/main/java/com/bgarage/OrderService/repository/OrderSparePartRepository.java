package com.bgarage.OrderService.repository;

import com.bgarage.OrderService.model.OrderSpareParts;
import org.springframework.data.repository.CrudRepository;

public interface OrderSparePartRepository extends CrudRepository<OrderSpareParts, Long> {
}
