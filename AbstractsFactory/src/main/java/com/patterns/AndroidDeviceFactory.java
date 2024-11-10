package com.patterns;

public class AndroidDeviceFactory implements DeviceFactory {
    @Override
    public Phone createPhone() {
        return new AndroidPhone();
    }

    @Override
    public Tablet createTablet() {
        return new AndroidTablet();
    }
}
