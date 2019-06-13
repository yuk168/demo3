package com.test2;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

/**
 * @author Administrator
 *
 */
public class CglibProxyExample implements MethodInterceptor {

	
	/*
	 * 生成CGLIB对象
	 */
	public Object getProxy(Class cls) {
		// CGlib enhancer增强类对象
		// 由于cglib是第三方的，所以是需要导包的
		Enhancer enhancer = new Enhancer();
		// 设置增强类型
		enhancer.setSuperclass(cls);
		// 定义代理逻辑对象为当前对象，要求当前对象实现MethodInterceptor方法
		enhancer.setCallback(this);
		// 生成并返回代理对象
		return enhancer.create();
	}

	/**
	 * 代理逻辑方法
	 */
	@Override
	public Object intercept(Object proxy, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
		System.out.println("调用真实对象前");
		// CGLIB反射调用真实对象方法
		Object result = methodProxy.invokeSuper(proxy, args);
		System.out.println("调用真实对象后");
		return result;
	}

}
