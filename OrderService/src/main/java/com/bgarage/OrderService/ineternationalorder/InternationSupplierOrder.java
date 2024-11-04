package com.bgarage.OrderService.ineternationalorder;

import org.springframework.scheduling.annotation.Scheduled;

public class InternationSupplierOrder {

    @Scheduled(cron = "0 1 12 * * *")
    public void placeOrder(){

    }
}
