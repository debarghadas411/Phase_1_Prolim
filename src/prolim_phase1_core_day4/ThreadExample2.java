package prolim_phase1_core_day4;
class MyThread implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<100;i++)
			System.out.println("Learning JAVA");
		
	}
	
}
class YourThread implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<50;i++)
			System.out.println("we are into phase 1");
	}
	
}
public class ThreadExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread r1=new MyThread();
		YourThread r2=new YourThread();
		Thread t1=new Thread(r1);
		Thread t2=new Thread(r2);
		t1.start();
		t2.start();

	}
	

}
