package com.example;

public class MouseDeviceDriver implements InputOutputSubsystem{

    private static MouseDeviceDriver mouseDeviceDriver;

    private MouseDeviceDriver() {
        System.out.println("Mouse device driver constructor");
    }

    public static MouseDeviceDriver getInstance() {
        if(mouseDeviceDriver == null) {
            synchronized (MouseDeviceDriver.class) {
                if(mouseDeviceDriver == null) {
                    mouseDeviceDriver = new MouseDeviceDriver();
                }
            }
        }
        return mouseDeviceDriver;
    }

    @Override
    public void create() {
        System.out.println("Virtual instance for I/O device is created");
    }

    @Override
    public void open() {
        System.out.println("Preparing the I/O device for use....");
        System.out.println("Ready to use");
    }

    @Override
    public void read() {
        System.out.println("Reading data from the I/O device");
    }

    @Override
    public void write() {
        System.out.println("Writing data to the I/O device");
    }

    @Override
    public void close() {
        System.out.println("Clean up operations....");
    }

    @Override
    public void ioctl() {
        System.out.println("Issuing control commands to the I/O device");
    }

    @Override
    public void destroy() {
        System.out.println("Deletes virtual instance of I/O device");
    }
}
