package prolim_phase1_core_day1;

public class TypecastExg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b;
		int x=257;
		b=(byte)x;
		long k = 560000000000L;
		x=(int)k;
		double d=x;
		float f=(float) d;
		System.out.println(k+"->"+x+"->"+d+"->"+f);
	}

}
