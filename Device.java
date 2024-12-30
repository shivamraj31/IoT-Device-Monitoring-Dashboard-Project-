package com.iotmonitoring;

public class Device {
    private String name;
    private String status;
    private double temperature;
    private double humidity;

    public Device(String name, String status, double temperature, double humidity) {
        this.name = name;
        this.status = status;
        this.temperature = temperature;
        this.humidity = humidity;
    }

    public String getName() {
        return name;
    }

    public String getStatus() {
        return status;
    }

    public double getTemperature() {
        return temperature;
    }

    public double getHumidity() {
        return humidity;
    }
}

