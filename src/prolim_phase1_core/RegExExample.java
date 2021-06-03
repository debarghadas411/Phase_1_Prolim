package prolim_phase1_core;

import java.util.regex.Pattern;

public class RegExExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String email_pattern="[a-z0-9A-Z+_.]+@[a-z0-9A-Z+_.]+\\.com";
		String phone_number_pattern="[+]91[0-9]{10}";
		String pwd_pattern="[A-Z]+[a-zA-z]*[0-9][a-zA-z]*[0-9][a-zA-z]*[0-9][a-zA-z]*";
		System.out.println(Pattern.matches(email_pattern,"firstname@prolim.com"));
		System.out.println(Pattern.matches(email_pattern,"viren@gmail.com"));
		System.out.println(Pattern.matches(email_pattern,"test123prepare@co.edu.com"));
		System.out.println(Pattern.matches(phone_number_pattern,"+919007081469"));
		System.out.println(Pattern.matches(phone_number_pattern,"+919007081469A"));
		System.out.println(Pattern.matches(phone_number_pattern,"+91900708146A"));
		System.out.println(Pattern.matches(phone_number_pattern,"+819007081469"));
		System.out.println(Pattern.matches(pwd_pattern,"Abcd123"));
		System.out.println(Pattern.matches(pwd_pattern,"Abcd1234"));
		System.out.println(Pattern.matches(pwd_pattern,"abcd123"));
		System.out.println(Pattern.matches(pwd_pattern,"Abcd1q2w3"));
		
	}

}
