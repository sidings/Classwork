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
		if (correctUser()){
			askPassword();
		}else{
			System.out.println("Unknown username, please contact the network administrator");
		}
	}

	private static void askPassword() {
		// TODO Auto-generated method stub
		
	}

	private static boolean correctUser() {
		System.out.println("Enter a username");
		//1 point comparing strings
			return waitForEntry().equals(username);
	}
	
}
