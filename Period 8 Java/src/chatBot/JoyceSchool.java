package chatBot;

public class JoyceSchool implements Chatbot {

	private boolean inSchoolLoop;
	private String schoolResponse;
	
	public void talk() {
		inSchoolLoop = true;
		while(inSchoolLoop){
			JoyceMain.println("(Type 'quit' to go back.)");
			schoolResponse = JoyceMain.promptInput("");
			if(schoolResponse.indexOf("quit") >= 0){
				inSchoolLoop = false;
				JoyceMain.promptInputForever("");
			}
			JoyceMain.println("That's my favorite part about school!");
		}
		
	}
	public boolean isTriggered(String userInput) {
		String[] triggers = {"school", "class", "teacher"};
		//create a for loop to iterate through your array of triggers
		if(JoyceMain.findKeyword(userInput, "school", 0)>=0){
			return true;
		}
		if(JoyceMain.findKeyword(userInput, "class", 0)>=0){
			return true;
		}
		return false;
	}
	

}