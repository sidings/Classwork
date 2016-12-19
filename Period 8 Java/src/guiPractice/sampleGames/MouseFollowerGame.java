package guiPractice.sampleGames;

import guiPractice.GUIApplication;

public class MouseFollowerGame extends GUIApplication {

	private CoordinateScreen coordScreen;
	public static MouseFollowerGame game;
	
	public static void main (String[] args){
		game = new MouseFollowerGame();
		Thread app = new Thread(game);
		app.start();
	}
	@Override
	protected void initScreen() {
		coordScreen = new CoordinateScreen(getWidth(), getHeight());
		setScreen(coordScreen);
	}

}
