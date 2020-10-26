package com.example;

public class Application {
    public static void main(String args[]){
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                MouseDeviceDriver mouse1 = MouseDeviceDriver.getInstance();
                System.out.println(mouse1.hashCode());
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                MouseDeviceDriver mouse2 = MouseDeviceDriver.getInstance();
                System.out.println(mouse2.hashCode());
            }
        });

        thread1.start();
        thread2.start();
    }
}
