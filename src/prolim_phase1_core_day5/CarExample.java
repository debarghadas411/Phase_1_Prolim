package prolim_phase1_core_day5;

class Car{
	String carName;
	String carType;
	public Car(String carName, String carType) {
		super();
		this.carName = carName;
		this.carType = carType;
	}
	public String getCarName() {
		return carName;
	}
	class Engine{
		String engineType;
		void setEngine() {
			if(Car.this.carType.equals("4WD")) {
				this.engineType="Smaller";
			}
			else {
				this.engineType="Larger";
			}
		}
	}
	
	
}
public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
