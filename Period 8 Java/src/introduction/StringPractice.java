package introduction;

import java.util.Scanner;

public class StringPractice {
	
	static Scanner input; 
	static String user;

	public static void main(String[] args) {
		//demonstrateStringMethods();
		createFields();
		promptName();
		promptForever();
	}
	
	public static void promptName() {
		print("Enter your name");
		user = input.nextLine();
		print("Glad to meet you, " + user + ". For the rest of time, I will call you, " + user + "You may call me Computer. We should become friends.");
	}

	public static void promptForever() {
		while(true){
			promptInput();
		}
	}

	public static void promptInput() {
		print("Please type something, " + user + ".");
		String userInput = input.nextLine();
		print("Congratulations! You typed: " + userInput);
	}

	public static void createFields() {
		input = new Scanner(System.in); 
		user = "";
	}

	public static void demonstrateStringMethods(){
		String text1 = new String("Hello World");
		String text2 = "Hello World";//same as above
		
		//.equals for comparing objects
		if(text1.equals(text2)){
			print("These strings are equal:");
		}
		print(text1);
		print(text2);
		
		String word1 = "aardvark";
		String word2 = "Zyzzyva";
		if (word1.compareTo(word2)<0)
			print("word1 comes before word2;");
		
	}
	
	public static void print(String s){
		String printString = "";
		int cutoff = 35;
		//check for words to add ~ s has a length greater than 0
		while (s.length()>0){
			String cut = "";
			String nextWord = "";
			//check to see if next word will fit on the line AND there must still be words to add
			while ((cut.length() + nextWord.length()) < cutoff && s.length() > 0){
				//add the next word to the line
				cut += nextWord;
				s = s.substring(nextWord.length());
				
				//identify the following word without spaces
				int endOfWord = s.indexOf(" ");
				//if there are no more spaces, this is the last word, so add the whole thing
				if (endOfWord == -1){
					endOfWord = s.length() -1; //-1 for index
				}
				nextWord = s.substring (0, endOfWord+1);
			}
			printString += cut + "\n";
		}
		
		System.out.println(printString);
	}
	/*public static void print(String s){
		String printString = s;
		int cutoff = 10;
		if(printString.length() > cutoff){
			for(int i = 0; i*cutoff<s.length(); i++){
				printString += getCut(s, cutoff, i+1) + "\n";
			}
		}
		System.out.println(printString);
	}

/*	private static String getCut(String s, int cutoff, int cut){
		int cutIndex = cut*cutoff;
		if(cutIndex > s.length())cutIndex = s.length();
		String currentCut = s.substring(0, cutIndex);
		//start at last index, go backwards
		int indexOfLastSpace = currentCut.length()-1;
		for(int index = currentCut.length()-1; index>=0; index--){
			String letter = currentCut.substring(index, index+1);
			if(letter.equals(" ")){
				indexOfLastSpace = index;
				break;
			}
		}
			//shorten the cut to end on a space
		currentCut = currentCut.substring(0, indexOfLastSpace);
		return currentCut;
	}*/

}
