package com.doughdev.healthapi.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class BloodPressureController {

    @GetMapping("/api/bp/metrics")
    List<String> getMetrics() {
        List<String> response = new ArrayList<>();

        response.add("Some sort of BP metric");

        return response;
    }
}
