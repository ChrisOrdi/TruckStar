package com.ordina.truckstar.truckstar.controller;

import com.ordina.truckstar.truckstar.model.Truck;
import com.ordina.truckstar.truckstar.service.TruckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/trucks")
public class TruckController {
    private final TruckService truckService;

    @Autowired
    public TruckController(TruckService truckService) {
        this.truckService = truckService;
    }

    @PostMapping
    public ResponseEntity<Truck> addTruck(@RequestBody Truck truck) {
        Truck savedTruck = truckService.saveTruck(truck);
        return new ResponseEntity<>(savedTruck, HttpStatus.CREATED);
    }

    @GetMapping
    public List<Truck> getAllTrucks() {
        return truckService.getAllTrucks();
    }

    @GetMapping("/total")
    public ResponseEntity<Long> getTotalNumberOfTrucks() {
        long totalTrucks = truckService.getTotalNumberOfTrucks();
        return ResponseEntity.ok(totalTrucks);
    }

    // Additional endpoints as needed
}

