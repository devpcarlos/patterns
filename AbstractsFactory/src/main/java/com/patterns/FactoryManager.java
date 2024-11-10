package com.patterns;

public class FactoryManager {
//esto rompe el principio open-closed
    public static DeviceFactory getDeviceFactory(Platform platform) {
        switch (platform) {
            case IOS:
                return new IosDeviceFactory();
            case ANDROID:
                return new AndroidDeviceFactory();
            default:
                throw new IllegalArgumentException("Unsupported platform: " + platform);
        }
    }
    // hay que mantener el principio de responsabilidad unica
}
