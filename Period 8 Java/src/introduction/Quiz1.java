package introduction;

import java.util.Scanner;

public class Quiz1 {
	
	static Scanner input = new Scanner(System.in);
	
	public static String waitForEntry(){
		return input.nextLine();
	}
	
	//1 point visibility private
	//1 point for data type declaration (throughout)
	private static String username = "test_user";
	private static String password = "test";
	
	//1 point for correct method
	public static void main(String[] args){
		//1 point for asking username once
		if (correctUser()){
			askPassword();
		}else{
			System.out.println("Unknown username, please contact the network administrator");
		}
	}

	private static void askPassword() {
		boolean inLoop = true;
		int triesRemaining = 3;
		while(inLoop){
			System.out.println("Enter your password");
			//1 point user waitForEntry() correctly
			String entry = waitForEntry();
			if (entry.equals(password)){
				System.out.println("You're in");
				inLoop = false;
			}else{
				//0.5 point if triesRemaining is changing
				triesRemaining--;
				if(triesRemaining == 0){
					//0.5 point printing "invalid password"
					System.out.println("Invalid Password");
					//0.5 point max 3 tries
					inLoop = false;
				}else{
					//0.5 point printing correct number
					System.out.println("You have " + triesRemaining + " attempts left.");
				}
			}
		}
	}

	private static boolean correctUser() {
		System.out.println("Enter a username");
		//1 point comparing strings
			return waitForEntry().equals(username);
	}
	
}
