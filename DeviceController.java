package com.iotmonitoring;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class DeviceController {

    private ObservableList<Device> deviceList;

    public DeviceController() {
        deviceList = FXCollections.observableArrayList();
        loadDeviceData();
    }

    // Simulating loading device data from a database or API
    private void loadDeviceData() {
        deviceList.add(new Device("Temperature Sensor", "Online", 25.5, 60.0));
        deviceList.add(new Device("Humidity Sensor", "Offline", 0.0, 0.0));
    }

    public ObservableList<Device> getDeviceList() {
        return deviceList;
    }
}

