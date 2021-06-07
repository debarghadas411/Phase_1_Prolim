package prolim_phase1_core_day3;
abstract class Pen{
	abstract public void write();
	abstract public void refill();
}
class monkey{
	public void jump() {
		System.out.println("I am jumping!!");
	}
	public void bite() {
		System.out.println("I am biting!!");
	}
}
interface basicanimal{
	public void eat();
	public void sleep();
}
class human extends monkey implements basicanimal{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("I am eating!!");
		
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("I am sleeping!!");
		
	}
	
}
class FountainPen extends Pen{

	@Override
	public void write() {
		// TODO Auto-generated method stub
		System.out.println("Pen writes");
		
	}

	@Override
	public void refill() {
		// TODO Auto-generated method stub
		System.out.println("Pen needs to refill");
	}
	public void change_nib() {
		System.out.println("Change Nib");
	}
}

public class PenExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		monkey m=new human();
		
	}

}
