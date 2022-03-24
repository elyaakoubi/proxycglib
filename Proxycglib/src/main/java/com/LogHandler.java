package com;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class LogHandler implements MethodInterceptor {

    private Object service;

    public LogHandler(Object service) {
        this.service = service;
    }

    @Override
    public Object intercept(Object proxy, Method method, Object[] args, MethodProxy arg3) throws Throwable {
        System.out.println("BEFORE");
        Object res = method.invoke(service, args);
        System.out.println("AFTER");
        return res;
    }
}

