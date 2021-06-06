package prolim_phase1_core_day2;

public class StringBufferExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb=new StringBuffer("Welcome to ");
		System.out.println(sb);
		sb.append("prolim");
		System.out.println(sb);
		sb.delete(1, 7);
		System.out.println(sb);
		char x=sb.charAt(9);
		System.out.println(sb);
		sb.replace(1, 5, "Phase1");
		System.out.println(sb);

	}

}
