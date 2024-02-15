package com.ordina.truckstar.truckstar.repository;

import com.ordina.truckstar.truckstar.model.Delivery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DeliveryRepository extends JpaRepository<Delivery,Long> {

    List<Delivery> findByCompleted(Boolean completed);

    // get total amountReceived4
    @Query("SELECT SUM(d.amountReceived) FROM Delivery d WHERE d.completed = true")
    Double sumAmountReceivedForCompletedDeliveries();

    // Get average amount received
    @Query("SELECT AVG(d.amountReceived) FROM Delivery d WHERE d.completed = true")
    Double avgAmountReceivedForCompletedDeliveries();
}
