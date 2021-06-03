package prolim_phase1_core;

public class StringExample {
	public static void main(String[] args) {
		String t= "Delhi";  
		String o = "Mumbai"; 
		String k= "delhi";  
		String y= new String ("Mumbai");   
		String l= new String ("delhi");   
		String p = new String("Hello");
		String b = "delhi";
//		SP->4 H->3
		System.out.println(o.equals(l)?"True":"False");
		System.out.println(y.equals(p)?"True":"False");
		System.out.println(t.equals(o)?"True":"False");
		System.out.println(k.equals(y)?"True":"False");
		System.out.println(p.equals(y)?"True":"False");
		System.out.print("\n\n");
		System.out.println(o==l?"True":"False");
		System.out.println(y==p?"True":"False");
		System.out.println(t==o?"True":"False");
		System.out.println(k==y?"True":"False");
		System.out.println(p==y?"True":"False");
		System.out.println(b==k?"True":"False");
	}

}
