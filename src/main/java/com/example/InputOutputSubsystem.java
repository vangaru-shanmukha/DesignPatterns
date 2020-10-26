package com.example;

public interface InputOutputSubsystem {
    void create();
    void open();
    void read();
    void write();
    void close();
    void ioctl();
    void destroy();
}
