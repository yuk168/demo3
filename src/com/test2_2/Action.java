package com.test2_2;

/**
 * 共同接口
 * @author Administrator
 *
 */
public interface Action {

	void doSomething();
	
	/**
	 * 新的需求，有多个真实对象（不同的接口）
	 */
	void doAnotherthing();
	void doTwoAnotherthing();
	
}
