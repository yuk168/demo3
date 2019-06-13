package com.test3;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

public class demo1 {
	
	/**
	 * Apache Commons Lang这个jar包中StringUtils的用法
	 * 
	 * 注意：
	 * 查看源码的，需要commons-lang3-3.7-sources.jar这个包
	 * 而使用的时候，需要commons-lang3-3.7.jar这个包
	 */
	@Test
	public void test1() {
		String str ="abc";
		boolean empty = StringUtils.isEmpty(str);
		System.out.println(empty);
	}

}
