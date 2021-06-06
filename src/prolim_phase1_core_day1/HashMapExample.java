package prolim_phase1_core_day1;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
	public static void main(String[] args) {
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(1,"Hello");
		hm.put(2, "World");
		hm.put(3, "Java");
		for(Map.Entry m:hm.entrySet()) {
			System.out.println(m.getKey()+":"+m.getValue());
		}
	}

}
