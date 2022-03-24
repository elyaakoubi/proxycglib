package com;
import net.sf.cglib.proxy.Enhancer;

public class Test {
    public static void main(String[] args) {
        Service service = new Service();

        LogHandler handler = new LogHandler(service);
        Service serviceProxy = (Service) Enhancer.create(Service.class,handler);
        serviceProxy.afficher(100);

    }
}
