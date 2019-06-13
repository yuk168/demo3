package com.test1_2;

import org.junit.Test;

/**
 * cglib的动态代理
 * 第三方的
 * 需要导入一个cglib的jar包
 * 在没有接口的情况下
 * @author Administrator
 *
 */
public class demotest {

	@Test
	public void testCGLIBProxy() {
		CglibProxyExample cpe = new CglibProxyExample();
		ReflectServiceImpl obj = (ReflectServiceImpl) cpe.getProxy(ReflectServiceImpl.class);
		obj.sayHello("张三");
	}
	
}
