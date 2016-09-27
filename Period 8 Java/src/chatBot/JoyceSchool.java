package chatBot;

public class JoyceSchool implements Chatbot {

	private boolean inSchoolLoop;
	private String schoolResponse;
	
	@Override
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

}