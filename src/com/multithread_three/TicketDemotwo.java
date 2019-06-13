package com.multithread_three;

/**
 * 同步方法
 * @author Administrator
 *
 */
public class TicketDemotwo {

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

class Tickett implements Runnable{
	int count = 100;

	//同步方法，效率低一点
	@Override
	public synchronized void run() {
		while(count>0){
			if(count>0){
				System.out.println(Thread.currentThread().getName()+"买到了，还剩"+count);
				count --;
			}
		}
		
	}
	
}
