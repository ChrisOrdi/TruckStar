package com.ordina.truckstar.truckstar.service;

import com.ordina.truckstar.truckstar.model.Delivery;
import com.ordina.truckstar.truckstar.repository.DeliveryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeliveryService {

   @Autowired
   private DeliveryRepository deliveryRepository;

    public Delivery saveDelivery(Delivery delivery) {
        return deliveryRepository.save(delivery);
    }

    public List<Delivery> getAllDeliveries() {
        return deliveryRepository.findAll();
    }

    public Delivery completeDelivery(Long deliveryId) {
        Delivery delivery = deliveryRepository.findById(deliveryId)
                .orElseThrow(() -> new RuntimeException("Delivery not found"));
        delivery.setCompleted(true);
        return deliveryRepository.save(delivery);
    }

    // Additional methods as needed
}

