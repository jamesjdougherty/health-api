package com.doughdev.healthapi.controllers;

import com.doughdev.healthapi.services.BpService;
import org.junit.jupiter.api.Test;

public class BloodPressureControllerTests {

    BpService bpService = new BpService();

    @Test
    void returns_bp_metrics() {
        BloodPressureController controller = new BloodPressureController(this.bpService);

    }
}
