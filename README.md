# IoT-Device-Monitoring-Dashboard-Project-
This project is a Java-based application that allows you to monitor the status of IoT devices (e.g., sensors, smart devices) in real time.

## Features:
- Display device status (online/offline).
- Monitor device metrics like temperature and humidity.
- Simulate database connection for storing device data.

## Technologies Used:
- **Java** (for backend and GUI)
- **JavaFX** (for graphical user interface)
- **MySQL** (for storing device data)

## How to Run:
1. Clone or download the repository.
2. Set up the database and configure the connection in `application.properties`.
3. Compile and run the program using the following commands:
   ```bash
   javac -d bin src/com/iotmonitoring/*.java
   java -cp bin com.iotmonitoring.App
