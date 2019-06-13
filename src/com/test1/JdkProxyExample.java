package com.test1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JdkProxyExample implements InvocationHandler {

	// 真实对象
	private Object target = null;

	/**
	 * 建立代理对象和真实对象的代理关系，并返回代理对象
	 * 
	 * @param target
	 * @return
	 */
	public Object bind(Object target) {
		this.target = target;
		return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("进入逻辑代理方法");
		System.out.println("在调度真实对象之前的服务");
		Object obj = method.invoke(target, args); // 相当于调用sayHelloWorld的方法
		System.out.println("在调度真实对象之后的服务");
		return obj;
	}

}
