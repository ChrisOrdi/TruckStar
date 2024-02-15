package com.ordina.truckstar.truckstar.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/data")
public class DataController {

    @GetMapping("/graph-data")
    public ResponseEntity<List<DataPoint>> getGraphData() {
        // Retrieve and return data points
    }
}

