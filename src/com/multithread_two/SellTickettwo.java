package com.multithread_two;

/**
 * 可以解决线程不安全的问题
 * 
 * 对SellTicket方法中的优化
 * 
 * @author Administrator
 *
 */
public class SellTickettwo {

	//测试代码
	public static void main(String[] args) {
		String str = "lock";
		Ticketss ticket = new Ticketss(100, str);
		new Thread(ticket, "窗口A").start();
		new Thread(ticket, "窗口B").start();
		new Thread(ticket, "窗口C").start();
		new Thread(ticket, "窗口D").start();

	}
}

class Ticketss implements Runnable {

	private int num;
	private int init = 1;
	private String lock;

	public Ticketss(int num, String lock) {
		this.num = num;
		this.lock = lock;
	}

	//同步锁的机制
	@Override
	public void run() {
		while (true) {
			//同步代码块
			synchronized (lock) {
				if (init > num) {
					System.out.println("火车票已经卖完了");
					return;
				}

				try {
					//Thread.sleep(20);
					lock.wait(30);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				if (init > num) {
                    System.out.println(Thread.currentThread().getName()+": 火车票已经卖完了");
                    return;
                }
				System.out.println(Thread.currentThread().getName() + "售出火车票:" + init++);

			}
		}

	}

}
