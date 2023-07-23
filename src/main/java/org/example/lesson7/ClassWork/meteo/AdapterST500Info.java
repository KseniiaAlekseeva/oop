package org.example.lesson7.ClassWork.meteo;

import java.time.LocalDateTime;

public class AdapterST500Info implements MeteoSensor {

    private SensorTemperature adapted;

    public AdapterST500Info(SensorTemperature data) {
        this.adapted = data;
    }

    @Override
    public int getId() {
        return adapted.identifier();
    }

    @Override
    public Float getTemperature() {
        return (float) adapted.temperature();
    }

    @Override
    public Float getHumidity() {
        return null;
    }

    @Override
    public Float getPressure() {
        return null;
    }

    @Override
    public LocalDateTime getDateTime() {
        LocalDateTime res = LocalDateTime.of(adapted.year(), 1, 1, 0, 0);
        res.plusDays(adapted.day() - 1);
        res.plusSeconds(adapted.second());
        return res;
    }
}
