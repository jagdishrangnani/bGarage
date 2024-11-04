package com.bgarage.PartsInventory.repository;

import com.bgarage.PartsInventory.model.SparePart;
import org.springframework.data.repository.CrudRepository;

public interface SparePartRepository extends CrudRepository<SparePart, Long> {
    public SparePart findSparePartByPartNumber(String partNumber);
}
