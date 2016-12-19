package guiPractice.sampleGames;

import guiPractice.GUIApplication;

public class MouseCoordinateGame extends GUIApplication{

	public static MouseCoordinateGame game;
	public static MyScreen myScreen;
	
	public MouseCoordinateGame(int i, int j) {
		// TODO Auto-generated constructor stub
	}


	public static void main(String[] args){
		game = new MouseCoordinateGame(500, 500);
		Thread app = new Thread(game);
		app.start();
}


	@Override
	protected void initScreen() {
		myScreen = new MyScreen(getWidth(),
	}
}