package com.test1;

import org.junit.Test;

/**
 * JDK的动态代理
 * @author Administrator
 *
 */

public class demotest {
	
	@Test
	public void testJdkProxy() {
		JdkProxyExample jdk = new JdkProxyExample();
		HelloWorld proxy = (HelloWorld) jdk.bind(new HelloWorldImpl());
		//proxy现在是一个代理对象
		proxy.sayHelloWorld();
	}

}
