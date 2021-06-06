package prolim_phase1_core_day4;

public class ThreadExample implements Runnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadExample te1=new ThreadExample();
		ThreadExample te2=new ThreadExample();
		ThreadExample te3=new ThreadExample();
		ThreadExample te4=new ThreadExample();
		Thread t1=new Thread(te1);
		Thread t2=new Thread(te2);
		Thread t3=new Thread(te3);
		Thread t4=new Thread(te4);
		t1.setName("Thread 1");
		t2.setName("Thread 2");
		t3.setName("Thread 3");
		t4.setName("Thread 4");
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);
		t3.setPriority(Thread.NORM_PRIORITY);
		t4.setPriority(Thread.MAX_PRIORITY);
		t1.setDaemon(true);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		Thread curr=Thread.currentThread();
		System.out.println("Thread is running "+curr.getName());
		System.out.println("Thread ID "+curr.getId());
		System.out.println("Thread status "+curr.isAlive());
		
		
		
	}

}
