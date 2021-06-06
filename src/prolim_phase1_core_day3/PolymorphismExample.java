package prolim_phase1_core_day3;
abstract class MNC{
	public MNC() {
		System.out.println("MNC constructor");
	}
	abstract public void method1();
	abstract public void method2();
	public void method3() {
		System.out.println("MNC method3");
	}
}
abstract class Infosys extends MNC{
	public void method1() {
		System.out.println("MNC method1 in Infosys");
	}
	
}
class Hello extends Infosys{
	public void method2() {
		System.out.println("MNC method2 in Hello");
	}
	public void method4() {
		System.out.println("method4 in Hello");
	}
}
public class PolymorphismExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Infosys obj=new Hello();
		obj.method1();
		obj.method2();
		obj.method3();
		Hello h= (Hello)obj;
		h.method4();
	}

}
