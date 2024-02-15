package com.ordina.truckstar.truckstar.service;

import com.ordina.truckstar.truckstar.model.Truck;
import com.ordina.truckstar.truckstar.repository.TruckRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TruckService {


    private final TruckRepository truckRepository;

    @Autowired
    public TruckService(TruckRepository truckRepository) {
        this.truckRepository = truckRepository;
    }
    public Truck saveTruck(Truck truck) {
        return truckRepository.save(truck);
    }

    public List<Truck> getAllTrucks() {
        return truckRepository.findAll();
    }

    public long getTotalNumberOfTrucks() {
        return truckRepository.count();
    }

    // Additional methods as needed
}
