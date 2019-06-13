package com.multithread_three;

/**
 * 方式一，同步代码块
 * 
 * (我自己对原始代码进行修改)
 * @author Administrator
 *
 */
public class TicketDmeo {
	public static void main(String[] args) {
		Ticket td = new Ticket();
		Thread t1 = new Thread(td,"1号");
		t1.start();
		Thread t2 = new Thread(td,"2号");
		t2.start();
		Thread t3 = new Thread(td,"3号");
		t3.start();
		Thread t4 = new Thread(td,"4号");
		t4.start();
		Thread t5 = new Thread(td,"5号");
		t5.start();
	}
	
}

class Ticket implements Runnable {
	int count = 100;
	Object obj = new Object();

	@Override
	public void run() {
		while(count>0){
			
			//同步代码块，第一种方法.同步代码块，加监视器,监视器是一个共享的对象
			synchronized (obj) {
				if (count > 0) {
					System.out.println(Thread.currentThread().getName() + "买到了，还剩" + count);
					count--;
					try {
						Thread.sleep(30);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}

			}
		}
		

	}

}