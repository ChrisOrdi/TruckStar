package com.ordina.truckstar.truckstar.repository;

import com.ordina.truckstar.truckstar.model.Delivery;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DeliveryRepository extends JpaRepository<Delivery,Long> {

    List<Delivery> findByCompleted(Boolean completed);
}
