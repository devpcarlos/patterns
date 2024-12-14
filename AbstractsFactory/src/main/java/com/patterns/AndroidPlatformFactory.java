package com.patterns;

public class AndroidPlatformFactory {
    public static DeviceFactory getDeviceFactory(Platform platform) {

        try {
            platform = Platform.ANDROID;
            return new AndroidDeviceFactory();
        } catch (Exception e) {
            throw new IllegalArgumentException("Unsupported platform: " + platform);
        }
    }
}
