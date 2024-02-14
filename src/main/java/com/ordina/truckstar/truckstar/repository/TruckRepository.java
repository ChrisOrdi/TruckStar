package com.ordina.truckstar.truckstar.repository;

import com.ordina.truckstar.truckstar.model.Truck;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TruckRepository extends JpaRepository<Truck, Long> {
}
