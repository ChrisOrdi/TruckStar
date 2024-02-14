package com.ordina.truckstar.truckstar.controller;

import com.ordina.truckstar.truckstar.model.Delivery;
import com.ordina.truckstar.truckstar.service.DeliveryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/deliveries")
public class DeliveryController {
    @Autowired
    private DeliveryService deliveryService;

    @PostMapping
    public ResponseEntity<Delivery> addDelivery(@RequestBody Delivery delivery) {
        Delivery savedDelivery = deliveryService.saveDelivery(delivery);
        return new ResponseEntity<>(savedDelivery, HttpStatus.CREATED);
    }

    @GetMapping
    public List<Delivery> getAllDeliveries() {
        return deliveryService.getAllDeliveries();
    }

    @PutMapping("/{id}/complete")
    public ResponseEntity<Delivery> completeDelivery(@PathVariable Long id) {
        Delivery completedDelivery = deliveryService.completeDelivery(id);
        return new ResponseEntity<>(completedDelivery, HttpStatus.OK);
    }

//    @PutMapping("/{id}/complete")
//    public ResponseEntity<Delivery> completeDelivery(@PathVariable Long id, @RequestParam Double amount) {
//        Delivery delivery = deliveryService.completeDelivery(id, amount);
//        return ResponseEntity.ok(delivery);
//    }

    @GetMapping("/totalAmountReceived")
    public ResponseEntity<Double> getTotalAmountReceived() {
        Double totalAmount = deliveryService.getTotalAmountReceived();
        return ResponseEntity.ok(totalAmount);
    }

    @GetMapping("/total")
    public ResponseEntity<Long> getTotalAmountOfDeliveries() {
        long totalAmountOfDeliveries = deliveryService.getTotalAmountOfDeliveries();
        return ResponseEntity.ok(totalAmountOfDeliveries);
    }

    // Additional endpoints as needed
}

