package com.doughdev.healthapi.models;

import lombok.Data;

@Data
public class Entry {
    private int day;
    private String description;
    private int bloodPressure;
}
