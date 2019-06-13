package com.multithread_three;

import java.util.concurrent.locks.ReentrantLock;

public class TicketDemothree {
	
	public static void main(String[] args) {
		Tickettt td = new Tickettt();
		Thread t1 = new Thread(td, "1号");
		t1.start();
		Thread t2 = new Thread(td, "2号");
		t2.start();
		Thread t3 = new Thread(td, "3号");
		t3.start();
		Thread t4 = new Thread(td, "4号");
		t4.start();
	}
	

}

class Tickettt implements Runnable{
	int count = 100;
	ReentrantLock rt = new ReentrantLock();	//第三种方法，显示加锁，效率最高
	
	@Override
	public void run() {
		while(count>0){
			rt.lock();	//枷锁
			if(count>0){
				System.out.println(Thread.currentThread().getName()+"买到了，还剩下"+count);
				count --;
			}
			rt.unlock();	//解锁
		}
	}
	
}
