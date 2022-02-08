package com.doughdev.healthapi.controllers;

import com.doughdev.healthapi.services.BpService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

@RestController
public class BloodPressureController {

    BpService bpService;

    public BloodPressureController(BpService bpService) {
        this.bpService = bpService;
    }

    @PostMapping("/api/bp/set/{metric}")
    void setBloodPressure(@PathVariable Integer metric) {
        if (metric != null) {
            this.bpService.setBloodPressure(metric);
        }
    }

    @GetMapping("/api/bp/metrics/{day}")
    Integer getBloodPressure(@PathVariable Integer day) {
        if (Objects.equals(this.bpService.getDay(), day)) {
            return this.bpService.getBloodPressure();
        } else {
            return null;
        }
    }
}
