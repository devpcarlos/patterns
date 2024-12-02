package com.patterns;

public class Main {
    public static void main(String[] args) {
        DeviceFactory deviceFactory = FactoryManager.getDeviceFactory(Platform.ANDROID);
        Tablet tablet = deviceFactory.createTablet();
        Phone phone = deviceFactory.createPhone();

        tablet.enable();
        phone.enable();
        //--------------------------------------------------------------------------------------

        DeviceFactory deviceFactory1 = AndroidPlatformFactory.getDeviceFactory(Platform.IOS);
        Tablet tablet1 = deviceFactory1.createTablet();
        Phone phone1 = deviceFactory1.createPhone();

        tablet1.enable();
        phone1.enable();

        //--------------------------------------------------------------------------------------

        DeviceFactory deviceFactory3 = IosPlatformFactory.getDeviceFactory();
        Tablet tablet3 = deviceFactory3.createTablet();
        Phone phone3 = deviceFactory3.createPhone();

        tablet3.enable();
        phone3.enable();

        //-------------------------------------------------------------------------------------
        //determinar la plataforma deseada(por ejemplo a traves de la entrada del usuario)
        Platform platform = Platform.IOS;
        // Obtener la fábrica adecuada sin usar FactoryManager
        DeviceFactory deviceFactory2 = FactoryManager.getDeviceFactory(platform);

        Tablet tablet2 = deviceFactory2.createTablet();
        Phone phone2 = deviceFactory2.createPhone();

        tablet2.enable();
        phone2.enable();

    }
}