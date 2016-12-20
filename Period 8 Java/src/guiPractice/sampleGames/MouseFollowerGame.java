package guiPractice.sampleGames;

import guiPractice.GUIApplication;

public class MouseFollowerGame extends GUIApplication {

	public static CoordinateScreen coordScreen;
	public static MouseFollowerGame game;
	public static MyScreen myScreen;
	
	public static void main (String[] args){
		game = new MouseFollowerGame();
		Thread app = new Thread(game);
		app.start();
	}
	@Override
	protected void initScreen() {
		myScreen = new MyScreen(getWidth(), getHeight());
		coordScreen = new CoordinateScreen(getWidth(), getHeight());
		setScreen(coordScreen);
	}

}
