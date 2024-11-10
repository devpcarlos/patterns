package com.patterns;

public class Main {
    public static void main(String[] args) {
//        DeviceFactory deviceFactory = FactoryManager.getDeviceFactory(Platform.ANDROID);
//        Tablet tablet = deviceFactory.createTablet();
//        Phone phone = deviceFactory.createPhone();
//
//        tablet.enable();
//        phone.enable();

        //determinar la plataforma deseada(por ejemplo a traves de la entrada del usuario)
        Platform platform = Platform.ANDROID;
        // Obtener la fábrica adecuada sin usar FactoryManager
        DeviceFactory deviceFactory2 = FactoryManager.getDeviceFactory(platform);

        Tablet tablet2 = deviceFactory2.createTablet();
        Phone phone2 = deviceFactory2.createPhone();

        tablet2.enable();
        phone2.enable();
    }
        // Método para obtener la fábrica según la plataforma
        private static DeviceFactory obtenerDeviceFactory(Platform platform) {
            if (platform == Platform.IOS) {
                return new IosDeviceFactory();
            } else if (platform == Platform.ANDROID) {
                return new AndroidDeviceFactory();
            } else {
                throw new IllegalArgumentException("Plataforma no compatible: " + platform);
            }

    }
}