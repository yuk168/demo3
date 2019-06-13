package com.test2_2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 新的需求：
	 * 假如有这样一个需求，有十个不同的RealObject，
	 * 同时我们要去代理的方法是不同的，
	 * 比要代理方法：doSomething、doAnotherThing、doTwoAnotherThing，
 * @author Administrator
 *
 */

public class DynamicProxyHandler implements InvocationHandler {

	private Object realObject;

	public DynamicProxyHandler(Object realObject) {
		this.realObject = realObject;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// 代理模式逻辑
		System.out.println("proxyObject do");
		return method.invoke(realObject, args);
	}

	public static void main(String[] args) {
		RealObject realObject = new RealObject();
		// 这里的proxy是在反射的包里面，java.lang.reflect.Proxy，说明底层是反射
		Action proxy = (Action) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[] { Action.class },
				new DynamicProxyHandler(realObject));
		proxy.doSomething();
		//新的需求，有多个真实对象（不同的接口）
		proxy.doAnotherthing();
		proxy.doTwoAnotherthing();
	}

}
