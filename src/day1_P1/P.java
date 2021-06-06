package day1_P1;

public class P {
	public static void main(String[]args) {
//		System.out.println("M:a : ",new M().a);
		System.out.println("M:b : "+new M().b);
		System.out.println("M:c : "+new M().c);
		System.out.println("N:a : "+new N().a);
		System.out.println("N:b : "+new N().b);
		System.out.println("N:c : "+new N().c);
	}
	 private void method1() {
		 System.out.println("Private method of P");
	 }
	 protected void method2() {
		 System.out.println("Protected method of P");
	 }
	 void method3() {
		 System.out.println("Default method of P");
	 }
	 public void method4() {
		 System.out.println("Public method of P");
	 }
}
