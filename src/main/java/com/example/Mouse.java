package com.example;

public class Mouse {
    private MouseDeviceDriver deviceDriver;
    Mouse() {
        deviceDriver = MouseDeviceDriver.getInstance();
    }
    public void create() {
        deviceDriver.create();
    }
    public void destroy() {
        deviceDriver.destroy();
    }
    public void open() {
        deviceDriver.open();
    }
    public void close() {
        deviceDriver.close();
    }
    public void read() {
        deviceDriver.read();
    }
    public void write() {
        deviceDriver.write();
    }
    public void ioctl() {
        deviceDriver.ioctl();
    }
}
