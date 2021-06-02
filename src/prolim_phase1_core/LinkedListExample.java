package prolim_phase1_core;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> ll=new LinkedList<String>();
		ll.add("January");
		ll.add("February");
		ll.add("March");
		ll.add("April");
		System.out.println("Size :"+ll.size());
		System.out.println("Elements :");
		Iterator i=ll.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println("\n\n");
		ll.add("September");
		ll.add("October");
		System.out.println("Size :"+ll.size());
		System.out.println("Elements :");
		i=ll.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println("\n\n");
		ll.add(4,"May");
		ll.add(5,"June");
		ll.add(6,"July");
		ll.add(7,"August");
		System.out.println("Size :"+ll.size());
		System.out.println("Elements :");
		i=ll.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println("\n\n");
		ll.addLast("November");
		ll.addLast("December");
		System.out.println("Size :"+ll.size());
		System.out.println("Elements :");
		i=ll.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}

}
