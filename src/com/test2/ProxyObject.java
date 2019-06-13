package com.test2;

/**
 * 代理对象
 * @author Administrator
 *
 */
public class ProxyObject implements Action,Action1,Action2{
	
	private Action realObject;
	private Action1 realObject1;
	private Action2 realObject2;
	
	//重写构造函数，并且是函数的重载
	public ProxyObject(Action realObject) {
		this.realObject = realObject;
	}
	public ProxyObject(Action1 realObject1) {
		this.realObject1 = realObject1;
	}
	public ProxyObject(Action2 realObject2) {
		this.realObject2 = realObject2;
	}

	//实现3个不同的接口
	@Override
	public void doSomething() {
		System.out.println("proxy do something");
		realObject.doSomething();
	}

	@Override
	public void doAnotherthing() {
		System.out.println("proxy do anotherthing");
		realObject1.doAnotherthing();
	}
	
	@Override
	public void doTwoAnotherthing() {
		System.out.println("proxy do twoanotherthing");
		realObject2.doTwoAnotherthing();
	}

}
