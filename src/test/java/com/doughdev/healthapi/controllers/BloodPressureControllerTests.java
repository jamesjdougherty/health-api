package com.doughdev.healthapi.controllers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class BloodPressureControllerTests {

    @Test
    void returns_list_of_bp_metrics() {
        BloodPressureController controller = new BloodPressureController();

        List<String> result = controller.getMetrics();

        List<String> expected = new ArrayList<>();
        expected.add("Some sort of BP metric");

        Assertions.assertEquals(result, expected);
    }
}
