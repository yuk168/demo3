package com.test2;

import org.junit.Test;

/**
 * 测试类
 * @author Administrator
 *
 */
public class demotest {

	/**
	 * 1最简单的静态代理模式
	 */
	@Test
	public void test1() {
		ProxyObject proxyObject = new ProxyObject(new RealObject());
		proxyObject.doSomething();
	}
	
	/**
	 * 新的需求：
	 * 假如有这样一个需求，有十个不同的RealObject，
	 * 同时我们要去代理的方法是不同的，
	 * 比要代理方法：doSomething、doAnotherThing、doTwoAnotherThing，
	 * 
	 * 2复杂点的静态代理模式
	 */
	@Test
	public void test2() {
		ProxyObject proxyObejct = null;
		proxyObejct = new ProxyObject(new RealObject());
		proxyObejct.doSomething();
		proxyObejct = new ProxyObject(new RealObject1());
		proxyObejct.doAnotherthing();
		proxyObejct = new ProxyObject(new RealObject2());
		proxyObejct.doTwoAnotherthing();
	}	
	
}
