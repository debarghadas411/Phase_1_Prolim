package prolim_phase1_core_day4;

import java.util.Scanner;

public class CustomExceptionExample {
	public static void validate(int salary) throws CustomException{
		if(salary<2000) {
			throw new CustomException("you need to work hard");
		}
		else if(salary>2100 && salary<5000) {
			throw new CustomException("you salary is somehow good");
		}
		else {
			throw new CustomException("salary is very good");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		try {
			validate(sc.nextInt());
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
@SuppressWarnings("serial")
class CustomException extends Exception{
	public CustomException(String msg) {
		super(msg);
	}
}
