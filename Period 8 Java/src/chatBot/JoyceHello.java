package chatBot;

public class JoyceHello implements Chatbot{

	private String helloResponse;
	private boolean inHelloLoop;
	
	private String[] calmResponses = {"We've already said hello. Let's move the conversation along.",
			"You've said hello already. Did you forget?"};
	private String[] angryResponses = {"Okay seriously. Stop saying hi.", "What is wrong with you"};
	
	private int helloCount;
	
	public JoyceHello(){
		helloCount = 0;
	}
	
	public void talk() {
		inHelloLoop = true;
		while(inHelloLoop){
			helloCount++;
			printResponse();//helper method
			helloResponse = JoyceMain.promptInput();
			//negate use !
			if(!isTriggered(helloResponse)){
				inHelloLoop = false;
				JoyceMain.promptInputForever();
			}
		}
	}

	
	private void printResponse() {
		if (helloCount>4){
			int responseSelection = (int)(Math.random()*angryResponses.length);
			JoyceMain.print(angryResponses[responseSelection]);
		}else{
			int responseSelection = (int)(Math.random()*calmResponses.length);
			JoyceMain.print(calmResponses[responseSelection]);
		}
	}

	public boolean isTriggered(String userInput) {
		if(JoyceMain.findKeyword(userInput, "hello", 0)>=0){
			return true;
		}
		if(JoyceMain.findKeyword(userInput, "hi", 0)>=0){
			return true;
		}
		if(JoyceMain.findKeyword(userInput, "hey", 0)>=0){
			return true;
		}
		return false;
	}

}
