package P2;

import P1.M;
import P1.N;
import P1.P;
public class Z extends M{
	public static void main(String[] arg) {
		X x=new X();
		System.out.println("X:b : "+x.b);
		System.out.println("X:c : "+x.c);
		System.out.println("X:d : "+x.d);
		Z z=new Z();
		System.out.println("M:method4 : ");
		z.method4();
		System.out.println("M:method2 : ");
		z.method2();
		N n=new N();
		System.out.println("N:method4 : ");
		n.method4();
		P p= new P();
		System.out.println("P:method4 : ");
		p.method4();
	}
}
