package com.ordina.truckstar.truckstar.service;

import com.ordina.truckstar.truckstar.model.Delivery;
import com.ordina.truckstar.truckstar.repository.DeliveryRepository;
import jakarta.persistence.EntityNotFoundException;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.logging.Logger;

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

    public Double getTotalAmountReceived() {
        Double totalAmount = deliveryRepository.sumAmountReceivedForCompletedDeliveries();
        return totalAmount != null ? totalAmount : 0.0;
    }

    public long getTotalAmountOfDeliveries() {
        return deliveryRepository.count();
    }



    // Additional methods as needed
}

