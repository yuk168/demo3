package com.test2_2;

/**
 * 真实对象
 * @author Administrator
 *
 */
public class RealObject implements Action{

	@Override
	public void doSomething() {
		System.out.println("realobject do something");
	}
	
	@Override
	public void doAnotherthing() {
		System.out.println("realobject do anotherthing");
	}
	
	@Override
	public void doTwoAnotherthing() {
		System.out.println("realobject do twoanotherthing");
	}

}
