package com.patterns;

public class IosDeviceFactory implements DeviceFactory{
    @Override
    public Phone createPhone() {
        return new IosPhone();
    }

    @Override
    public Tablet createTablet() {
        return new IosTablet();
    }
}
