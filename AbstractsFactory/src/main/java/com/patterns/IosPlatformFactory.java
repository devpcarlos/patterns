package com.patterns;

public class IosPlatformFactory {

public static DeviceFactory getDeviceFactory() {

    try {
        return new IosDeviceFactory();
    } catch (Exception e) {
        throw new IllegalArgumentException("Unsupported platform: " );
    }
}

}
