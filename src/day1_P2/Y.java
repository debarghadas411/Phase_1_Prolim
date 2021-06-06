package day1_P2;

import day1_P1.M;
import day1_P1.N;

public class Y extends N{
	public static void main(String[] arg) {
		X x=new X();
		System.out.println("X:b : "+x.b);
		System.out.println("X:c : "+x.c);
		System.out.println("X:d : "+x.d);
		M m=new M();
		System.out.println("M:method4 : ");
		m.method4();
		Y n=new Y();
		System.out.println("N:method4 : ");
		n.method4();
		System.out.println("N:method2 : ");
		n.method2();
	}

}
