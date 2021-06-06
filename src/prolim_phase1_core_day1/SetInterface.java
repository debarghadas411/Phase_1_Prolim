package prolim_phase1_core_day1;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.TreeSet;



public class SetInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		LinkedHashSet lhs1 =new LinkedHashSet();
		LinkedHashSet<Integer> lhs2 =new LinkedHashSet<Integer>();
		Scanner sc = new Scanner(System.in);
		Object ob1=Integer.parseInt(sc.nextLine());
		Object ob2=Integer.parseInt(sc.nextLine());
		Object ob3=Float.parseFloat(sc.nextLine());
		Object ob4=Float.parseFloat(sc.nextLine());
		Object ob5=sc.nextLine();
		Object ob6=sc.nextLine();
		Object ob7=Boolean.parseBoolean(sc.nextLine());
		lhs1.add(ob1);
		lhs1.add(ob2);
		lhs1.add(ob3);
		lhs1.add(ob4);
		lhs1.add(ob5);
		lhs1.add(ob6);
		lhs1.add(ob7);
		System.out.println(lhs1);
		
		int int1=Integer.parseInt(sc.nextLine());
		int int2=Integer.parseInt(sc.nextLine());
		int int3=Integer.parseInt(sc.nextLine());
		int int4=Integer.parseInt(sc.nextLine());
		int int5=Integer.parseInt(sc.nextLine());
		int int6=Integer.parseInt(sc.nextLine());
		int int7=Integer.parseInt(sc.nextLine());
		int int8=Integer.parseInt(sc.nextLine());
		lhs2.add(int1);
		lhs2.add(int2);
		lhs2.add(int3);
		lhs2.add(int4);
		lhs2.add(int5);
		lhs2.add(int6);
		lhs2.add(int7);
		lhs2.add(int8);
		System.out.println(lhs2);
		
		TreeSet ts= new TreeSet();
		ts.add("Java");
		ts.add("Python");
		ts.add("HTML");
		ts.add("Ruby");
		ts.add("PHP");
		ts.add("C");
		
		ts.remove("C");
		ts.remove("Ruby");
		
		ts.add("C++");
		ts.add("C#");
		ts.add("JavaScript");
		
		System.out.println("IS JAVE PART :"+ts.contains("Java"));
		ts.clear();
		System.out.println(ts);
		

	}

}
