package prolim_phase1_core_day3;
abstract class Marks{
	abstract public float getPercentage();
}
class A extends Marks{
	int m1,m2,m3;
	

	public A(int m1, int m2, int m3) {
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
	}


	@Override
	public float getPercentage() {
		// TODO Auto-generated method stub
		return (m1+m2+m3)/3.0f;
	}
	
}
class B extends Marks{
	int m1,m2,m3,m4;
	
	public B(int m1, int m2, int m3, int m4) {
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
		this.m4 = m4;
	}

	@Override
	public float getPercentage() {
		// TODO Auto-generated method stub
		return (m1+m2+m3+m4)/4.0f;
	}
	
}
public class StudentPercentage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Marks S1=new A(100,89,97);
		Marks S2=new B(98,89,97,99);
		System.out.println("%age of S1 = "+S1.getPercentage());
		System.out.println("%age of S2 = "+S2.getPercentage());
	}

}
