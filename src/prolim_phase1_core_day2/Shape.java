package prolim_phase1_core_day2;

public class Shape {
	private double length;
	private double breadth;
	public Shape() {
		length=0.0d;
		breadth=0.0d;
	}
	public Shape(double side) {
		length=side;
		breadth=0.0d;
	}
	public Shape(float radius) {
		length=radius;
		breadth=0.0d;
	}
	public Shape(double length, double breadth) {
		this.length=length;
		this.breadth=breadth;
	}
	public void display_circle() {
		System.out.println("AREA CIRCLE:"+3.14*length*length);
	}
	public void display_square() {
		System.out.println("AREA SQUARE:"+length*length);
	}
	public void display_rectangle() {
		System.out.println("AREA RECTANGLE:"+length*breadth);
	}
	public void calculate(int base,int height) {
		System.out.println("AREA TRIANGLE:"+base*height*0.5);
	}
	public void calculate(float diagonal1,float diagonal2) {
		System.out.println("AREA RHOMBUS:"+diagonal1*diagonal2*0.5);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s1=new Shape(21.0,22.0);
		s1.display_circle();
		s1.display_rectangle();
		s1.display_square();
		s1.calculate(21, 22);
		s1.calculate(23, 24);

	}

}
