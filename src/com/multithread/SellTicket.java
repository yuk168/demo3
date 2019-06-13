package com.multithread;

/**
 * 该方法有问题
 * 循环无法结束？
 * @author Administrator
 *
 */
public class SellTicket {

	public static void main(String[] args) {
		TicketWindow tw = new TicketWindow();
		Thread t1 = new Thread(tw, "一号窗口");
		Thread t2 = new Thread(tw, "二号窗口");
		Thread t3 = new Thread(tw, "三号窗口");
		t1.start();
		t2.start();
		t3.start();
	}
}

class TicketWindow implements Runnable {
	private int tickets = 10;

	@Override
	public synchronized void run() {
		// TODO Auto-generated method stub
		while (true) {
			if (tickets > 0) {
				System.out.println(Thread.currentThread().getName() + "准备出票,还剩余票:" + tickets + "张");
				System.out.println("-------");
				System.out.println(Thread.currentThread().getName() + "卖出一张火车票,还剩" + tickets + "张");
			} else {
				System.out.println("余票不足,暂停出票");
				/*try {
					Thread.sleep(1000 * 60 * 5);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}*/
				break;
				
			}
		}

	}

}
