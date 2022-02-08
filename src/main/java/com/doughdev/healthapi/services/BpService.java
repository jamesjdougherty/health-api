package com.doughdev.healthapi.services;

import com.doughdev.healthapi.models.Entry;
import org.springframework.stereotype.Service;

@Service
public class BpService {

    Entry entry;

    public Integer getDay() {
        return this.entry.getDay();
    }

    public Integer getBloodPressure() {
        return this.entry.getBloodPressure();
    }

    public void setBloodPressure(int value) {
        this.entry.setBloodPressure(value);
    }
}
